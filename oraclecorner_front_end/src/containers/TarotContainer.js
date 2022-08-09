import React, {Component, Fragment, useEffect, useState} from 'react';
import {BrowserRouter as Router, Route, Switch, Routes} from 'react-router-dom';
import TarotList from '../TarotDeck/TarotList.js';
import Request from '../helpers/request.js';



function TarotContainer({tarots}){




    return(
      <TarotList tarots={tarots}/>
    )


}




export default TarotContainer;