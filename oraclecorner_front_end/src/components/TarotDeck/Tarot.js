import React, { Fragment } from 'react';
import { Link } from 'react-router-dom';

const Tarot = ({ tarot }) => {

  if (!tarot) {
    return "Loading..."
  }

  const url = "/tarots/" + tarot.id;
  return (
    
    <Fragment>
      <p>

        {/* <h1>hello</h1> */}
        <Link to={url} className="name">
          <p>{tarot.name} :</p>
           <p>{ tarot.value}:</p>
           <p className='bob'>suit:{tarot.suit}:</p>
           <img src={tarot.urlimage} height={200} ></img>
        </Link>
        

       
        
      </p>

    </Fragment>
  )
}

export default Tarot;



