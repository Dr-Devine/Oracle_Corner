import React from 'react';
import Tarot from "./Tarot";

const TarotDetail = ({ tarot, handleSave }) => {

    if (tarot) {


        const onSave = () => {
            handleSave(tarot.id)
        }

        return (
            <>
                <div className="component">
                    <Tarot tarot={tarot} />
                    <ul>
                    </ul>
                    <button onClick={onSave}>Save {tarot.name}</button>
                </div>
            </>
        )

    } else {
        return (
            <>
                <p>timeout...</p>
            </>
        )
    }
}

export default TarotDetail;