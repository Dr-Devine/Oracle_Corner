import React, {Fragment, useEffect, useState} from 'react';
import {BrowserRouter as Router, Route, Routes, useParams} from 'react-router-dom';
import NavBar from '../NavBar.js';
import Request from '../helpers/request.js';
import Coinflip from '../components/coinFlip/Coinflip.js';
import TarotContainer from './TarotContainer.js';
import TarotForm from '../TarotDeck/TarotForm.js';
import TarotDetail from '../TarotDeck/TarotDetail.js'



const MainContainer = () => {

    const [tarots, setTarots] = useState([])
  
    useEffect(() => {
      // getTarots()
    }, [])
  
   
  
    const getTarots = () => {
      fetch("http://localhost:8080/api/tarots")
      .then(res => res.json())
      .then(tarotsData => setTarots(tarotsData))
    }
  
   
  
    const findTarotById = (id) => {
        return tarots.find((tarot) => {
          return tarot.id === parseInt(id);
        })
    }
  
    const createTarot = (tarot) => {
      console.log("create tarot called", tarot);
      const request = new Request();
      request.post("/api/tarots", tarot)
      .then(() => window.location = '/tarots')
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
      return <TarotDetail tarot={foundTarot} handleDelete={handleDelete}/>;
    };
  
      return (
        <Router>
          <NavBar/>
        <Routes>
        <Route path="/tarots/:id" element={
             <TarotDetailWrapper/>
        }/>
        <Route path="/coinflip" element={
          <Coinflip/>
        }/>
       
      
        
        <Route path="/tarots" element={<TarotContainer tarots={tarots}/>}/>
  
        </Routes>
          </Router>
         
      )
  }
  
  export default MainContainer;