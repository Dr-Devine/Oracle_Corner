import React, { Fragment } from 'react';
import { Link } from 'react-router-dom';

const Tarot = ({ tarot }) => {

  if (!tarot) {
    return "getting info..."
  }

  const url = "/tarots/" + tarot.id;
  return (


    <Fragment>
      <Link to={url} className="name">
        <p>{tarot.name} :</p>
        <p>{tarot.value}:</p>
        <p className='bob'>suit:{tarot.suit}:</p>
        <img className='tarrotImg' src={tarot.urlimage} height={200} ></img>
      </Link>
    </Fragment>
  )
}

export default Tarot;



