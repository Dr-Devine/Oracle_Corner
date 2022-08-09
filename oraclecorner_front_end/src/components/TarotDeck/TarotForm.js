
import React, { useState, useEffect } from 'react';

const TarotForm = ({ tarots, onCreate }) => {

    const [stateTarot, setStateTarot] = useState(
        {
            name: "",
            value: "",
            meaning: "",
            suit: "",
            description: "",
            urlimage: ""


        }
    )


    const handleChange = function (event) {
        let propertyName = event.target.name;
        let copiedTarot = { ...stateTarot }
        copiedTarot[propertyName] = event.target.value;
        setStateTarot(copiedTarot)
    }

    const handleTarot = function (event) {
        const index = parseInt(event.target.value)
        const selectedTarot = tarots[index]
        let copiedTarot = { ...stateTarot };
        copiedTarot['tarot'] = selectedTarot
        setStateTarot(copiedTarot)
    }

    const handleSubmit = function (event) {
        console.log("handle submit called");
        event.preventDefault();
        onCreate(stateTarot);
    }

    const tarotOptions = tarots.map((tarot, index) => {
        return <option key={index} value={index}>{tarot.name}</option>
    })

    if (!tarots.length === 0) {
        return <p>waiting...</p>
    }
    return (
        <>
            <form onSubmit={handleSubmit}>
                <input type="text" placeholder="name" name="name" onChange={handleChange} value={stateTarot.name} />
                <h1>hohoh</h1>
                <select name="tarot" onChange={handleTarot} defaultValue="select-tarot">
                    <option disabled value='select-tarot'>Select a tarot</option>
                    {tarotOptions}

                </select>
                <button type="submit">Save</button>
            </form>
        </>
    )
}

export default TarotForm;