import React, { useState } from 'react';
import { Link } from 'react-router-dom';

const TarotList = ({ savedTarots, removeTarot }) => {

	const tarots = savedTarots.map((tarot) => {
		return (
			<li key={tarot.id}>
				<p>{tarot.name}</p>

				<Link
					key={tarot.id}
					to={{
						pathname: `/tarots/${tarot.id}`
					}}>
					<img className='tarrotImg' src={tarot.urlimage} height={200} ></img>
					<p>{tarot.meaning}</p>
				</Link>
				<button onClick={() => removeTarot(tarot.id)}>Remove Card</button>
			</li>
		)
	})

	return (
		<>
			{tarots}
		</>
	)

}

export default TarotList;