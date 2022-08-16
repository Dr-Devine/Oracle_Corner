import React, { Fragment, useEffect, useState } from 'react';
import { BrowserRouter as Router, Route, Routes, useParams } from 'react-router-dom';
import NavBar from '../NavBar.js';
import Request from '../helpers/request.js';
import Coinflip from '../components/coinFlip/Coinflip.js';
import TarotContainer from './TarotContainer.js';
import TarotDetail from '../components/TarotDeck/TarotDetail.js'
import Home from '../components/TarotDeck/Home.js';
import Profile from '../components/TarotDeck/Profile.js';
import About from '../components/TarotDeck/About.js';
import Sigil from '../components/TarotDeck/Sigil.js';


const MainContainer = () => {

  const [tarots, setTarots] = useState('');
  const [savedTarots, setSavedTarots] = useState([]);
  const [users, setUsers] = useState([]);

  const getTarots = () => {
    fetch("http://localhost:8080/api/tarots")
      .then((res) => res.json())
      .then((data) => {
        setTarots(data);
      });
  }

  const getUsers = () => {
    fetch("http://localhost:8080/api/users")
    .then((res) => res.json())
    .then((data) => {
      setUsers(data);
    });
  }

  useEffect(() => {
    getUsers();
  },[])

  useEffect(() => {
    getTarots();
  }, [])

  const saveTarotToProfile = (tarot) => {
    setSavedTarots([...savedTarots, tarot]);
  }

  const removeTarot = (tarotId) => {
    const currentSavedTarots = savedTarots.filter((tarot) => tarot.id != tarotId);
    setSavedTarots(currentSavedTarots);
  }

  const findTarotById = (id) => {
    if (tarots.length < 1) return;
    return tarots.find((tarot) => {
      return tarot.id === parseInt(id);
    })
  }

  const handleDelete = (id) => {
    const request = new Request();
    const url = '/api/tarots/' + id;
    request.delete(url).then(() => {
      window.location = '/tarots';
    });
  }

  const TarotDetailWrapper = () => {
    const { id } = useParams();
    let foundTarot = findTarotById(id)
    return <TarotDetail tarot={foundTarot} handleDelete={handleDelete} />;
  };

  return (

    <Router>
      <NavBar savedTarots={savedTarots} />
      <Routes>

        <Route path="/tarots/:id" element={
          <TarotDetailWrapper />
        } />

        <Route path='/home' element={
          <Home />
        } />

        <Route path='/profile' element={
          <Profile tarots={tarots} users={users} getUsers={getUsers} savedTarots={savedTarots} removeTarot={removeTarot} />
        } />

        <Route path="/coinflip" element={
          <Coinflip />
        } />

        <Route path="/sigil" element={
          <Sigil/>
        }/>

        <Route path="/tarots" element={
          <TarotContainer tarots={tarots} getTarots={getTarots} saveTarotToProfile={saveTarotToProfile} />
        } />

        <Route path="/about" element={
          <About />
        } />

      </Routes>
    </Router>

  )
}

export default MainContainer;