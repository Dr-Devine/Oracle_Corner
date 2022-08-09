import React, {Fragment} from 'react';
import { Link } from 'react-router-dom';

const Tarot = ({tarot}) => {

  if (!tarot){
    return "Loading..."
  }
  const url = "/tarots/" + tarot.id;
  return (
    <Fragment>
    <p>
    <Link to = {url} className="name">
    {tarot.name}
    </Link>
    </p>
   
    </Fragment>
  )
}

export default Tarot;