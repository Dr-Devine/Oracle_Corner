import React from 'react';
import { Link } from 'react-router-dom';


const NavBar = ({saveTarots}) => {

  return (

    <header>
      {/* <img src="../images/top-left-1.jpeg" alt="Logo"/> */}
    
    <div className='navBar'>
      <ul>
        <li className='home'>
          <Link
            to={{
              pathname: "/home",
            }}
          >
          Home
        </Link>
        </li>

        <li className='about'>
          <Link
            to={{
              pathname: "/about",
            }}
          >
          About
        </Link>
        </li>
        
        <li className='tarots'>
          <Link
            to={{
              pathname: "/tarots",
            }}
          >
          Tarots
        </Link>
        </li>

        <li className='sigil'>
          <Link
            to={{
              pathname: "/sigil",
            }}
          >
          Sigil
        </Link>
        </li>

        <li className='#'>
          <Link
            to={{
              pathname: "/coinflip",
            }}
          >
          CoinFlip
        </Link>
        </li>

        <li className='profile'>
          <Link
            to={{
              pathname: "/profile",
            }}
          >
          Profile
        </Link>
        </li>
        </ul>
      </div>
    </header>
  )
}

export default NavBar;