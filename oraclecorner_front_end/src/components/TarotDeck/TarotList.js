import React from 'react';
import Tarot from './Tarot.js';

const TarotList = ({tarots}) => {

	const tarotElements = tarots.map((tarot, index) => {
		return(
			<li key={index} className="component-item">
				<div className="component">
					<Tarot tarot={tarot}/>
				</div>
			</li>
		)	
	})

	


	return (
		
		<ul className='component-list'>
			{tarotElements}
		</ul>
     
	)
}
 export default TarotList;