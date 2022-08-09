import React, {Component, Fragment, useEffect, useState} from 'react';
// import {BrowserRouter as Router, Route, Switch, Routes} from 'react-router-dom';
import TarotList from '../components/TarotDeck/TarotList.js';
// import Request from '../helpers/request.js';
import TarotForm from '../components/TarotDeck/TarotForm.js';



function TarotContainer({tarots}){




    return(
      <>
      <TarotList tarots={tarots}/>
      {/* <TarotForm/> */}
      </>
    )


}




export default TarotContainer;