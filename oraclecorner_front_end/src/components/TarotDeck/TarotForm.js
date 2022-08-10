// import Tarot from './Tarot';
// import React, { useState, useEffect } from 'react';

// const TarotForm = ({ tarots, onCreate }) => {

//     const [stateTarot, setStateTarot] = useState(
//         {
//             name: "",
//             value: "",
//             meaning: "",
//             suit: "",
//             description: "",
//             urlimage: ""


//         }
//     )


//     const handleChange = function (event) {
//         let propertyName = event.target.name;
//         let copiedTarot = { ...stateTarot }
//         copiedTarot[propertyName] = event.target.value;
//         setStateTarot(copiedTarot)
//     }

//     const handleTarot = function (event) {
//         const index = parseInt(event.target.value)
//         const selectedTarot = tarots[index]
//         let copiedTarot = { ...stateTarot };
//         copiedTarot['tarot'] = selectedTarot
//         setStateTarot(copiedTarot)
//     }

//     const handleSubmit = function (event) {
//         console.log("handle submit called");
//         event.preventDefault();
//         onCreate(stateTarot);
//     }

//     const save = (event) => {
//         const index = parseInt(event.target.value)
//         const selectedTarot = tarots[index]
//         let copiedTarot = { ...stateTarot };
//         copiedTarot['tarot'] = selectedTarot
//         setStateTarot(copiedTarot)
//     }



//     const tarotElements = tarots.map((tarot, index) => {
//         return (
//             <li key={index} className="component-item">
//                 <div className="component">
//                 <Tarot tarot={tarot} />
//                 </div>  
//             </li>
//         )
//             })


//             if (!tarots.length === 0) {
//         return <p>waiting...</p>
//     }
//             return (
//             <>
//             <ul className='components-list'>
//                 {tarotElements}
//             </ul>
//                 <form onSubmit={handleSubmit}>
//                     <div className="form-group">
//                         </div>
//                          <button onClick={save} type="submit">Save</button>
//                 </form>
//             </>
//             )
// }
//             //testing
//             export default TarotForm;