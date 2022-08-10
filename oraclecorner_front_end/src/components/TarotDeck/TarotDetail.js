import React from 'react';
import Tarot from "./Tarot";

const TarotDetail = ({ tarot, handleDelete, handleSave }) => {

    if (tarot) {

        // const onDelete = () => {
        //     handleDelete(tarot.id)
        // }
        const onSave = () => {
          handleSave(tarot.id)
        }

        return (
            <>
                <div className="component">
                    <Tarot tarot={tarot} />
                    <ul>
                    </ul>
                    {/* <button onClick={onDelete}>Undo {tarot.name}</button> */}
                    <button onClick={onSave}>Save {tarot.name}</button>
                </div>
            </>
        )
        
    } else {
        return (
            <>
                <p>waiting...</p>
            </>
        )
    }
}

export default TarotDetail;