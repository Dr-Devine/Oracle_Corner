import React from 'react';


const NavBar = (props) => {
  return (
    <header>

      <img src="../images/top-left-icon.gif" alt="Logo"/>
      
      <link rel="stylesheet" href="/css/styles.css">
      </link>
      <ul>
      <li className="Home">
          <a onClick="/" href="/Home" >Home</a>
        </li>
        <li className="Tarot">
          <a href="/Tarot">Tarot</a>
        </li>
        <li className="Sigil">
          <a href="/Sigil">Sigil</a>
        </li>
        <li className="CoinFlip">
          <a href="/CoinFlip" >CoinFlip</a>
        </li>
        <li className="Profile">
          <a href="/Profile" >Profile</a>
        </li>    
      </ul>
    </header>
    
  )
}

export default NavBar;