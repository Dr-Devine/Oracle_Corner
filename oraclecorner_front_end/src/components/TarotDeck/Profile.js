import React from 'react'
import TarotList from './TarotList'

const Profile = ({ savedTarots, removeTarot, users }) => {

  const [currentUser, setCurrentUser] = React.useState(null);

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
          <p className='savedsigilslist'>Saved Sigils</p>
          <img className='usersimage' src={currentUser.userImage}></img>
          <h4  className='usersname' style={{ 'color': 'white' }}>Hello:   {currentUser.firstName} {currentUser.lastName}</h4>
          <img className='Sigil2' src={"../images/Sigil.png"} height={200}  ></img>
          <img className='Sigil3' src={"../images/removesigil.png"} height={25}  ></img>
          <img className='Sigil4' src={"../images/Sigil1.png"} height={300}  ></img>
          <p className='savedtarotsslist'>Saved Tarots</p>
        </div>
      }
      <TarotList savedTarots={savedTarots} removeTarot={removeTarot} />
    </>
  )
}

export default Profile