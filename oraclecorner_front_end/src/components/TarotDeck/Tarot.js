import React, { Fragment } from 'react';
import { Link } from 'react-router-dom';

const Tarot = ({ tarot }) => {

  if (!tarot) {
    return "Loading..."
  }
  const url = "/Tarot/" + tarot.id;
  return (
    <Fragment>
      <p>
        <h1>hello</h1>
        <Link to={url} className="name">
          {tarot.name}
        </Link>
      </p>

    </Fragment>
  )
}

export default Tarot;



