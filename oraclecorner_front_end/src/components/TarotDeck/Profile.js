import React from 'react'
import TarotList from './TarotList'

const Profile = ({ savedTarots, removeTarot, users }) => {

  const [currentUser, setCurrentUser ] = React.useState(null);

  React.useEffect(() => {
    if (!currentUser) {
      let randomNum = Math.floor(Math.random() * users.length);
      setCurrentUser(users[randomNum]);
    }

  }, [])

  return (
    <>
    {currentUser && 
    <div>
      <h1 className='usersname' style={{'color': 'white'}}>Hello {currentUser.firstName} {currentUser.lastName}</h1>
      <img className='usersimage' src={currentUser.userImage}></img>
    </div>
    }
      <TarotList savedTarots={savedTarots} removeTarot={removeTarot} />
    </>
  )
}

export default Profile