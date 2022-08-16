import React, { Component, Fragment, useEffect, useState } from 'react';


function TarotContainer({ tarots, saveTarotToProfile }) {

  const [currentTarot, setCurrentTarot] = useState();

  const getRandomTarot = () => {
    let randomNum = Math.floor(Math.random() * tarots.length);
    setCurrentTarot(tarots[randomNum]);
  }

  const saveTarot = (tarot) => {
    saveTarotToProfile(tarot);
  }

  return (
    <>
      <div className="tarots-container">
      <h4 className='h4tag'>Your daily divanation</h4>
        {currentTarot ?
          <>
            <div className='current-tarot-container'>
              <div className='card-container'>
                <div style={{ display: 'flex', alignItems: 'center' }}>
                  <img className='tarrotImg' src={currentTarot.urlimage} height={200} ></img>
                  <div className='buttonContainer' style={{ paddingLeft: '5vw' }}>
                    <button onClick={() => saveTarot(currentTarot)} className='button'>
                      Save Card?
                    </button>
                    <button onClick={() => getRandomTarot()} className='button'>
                      Draw another Card?
                    </button>
                  </div>
                </div>
              </div>
              <div className='information-container'>
                <p className='infoOnCards'>Name of Card:{currentTarot.name}</p>
                <p className='infoOnCards'>Card Suit:{currentTarot.suit}</p>
                <p className='infoOnCards'>Meaning:{currentTarot.meaning}</p>
              </div>
            </div>
          </>
          :
          <div className='buttonContainer'>
          <button onClick={() => getRandomTarot()} className='button'>
            {currentTarot ? 'Draw another Card?' : 'Whats my daily fortune?'}
          </button>
         </div>
        }
      </div>
    </>
  )
}

export default TarotContainer;