import React from 'react';
import Tarot from "./Tarot";

const TarotDetail = ({tarot, handleDelete}) => {

    if(tarot){

      

          const onDelete = () => {
            handleDelete(tarot.id)
            }

          

        
        return(

            <div className = "component">
                <Tarot tarot={tarot}/>
                <ul>
                
                </ul>
                <button onClick={onDelete}>Delete {tarot.name}</button>
            </div>
            
        )

    }
    return(
        <p>waiting...</p>
    )



}

export default TarotDetail;