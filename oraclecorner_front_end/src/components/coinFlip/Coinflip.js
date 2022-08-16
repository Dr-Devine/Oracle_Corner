import React from 'react';

const Coinflip = () => {

    const [coinResult, setCoinResult] = React.useState('');
    const [headCounter, setHeaderCounter] = React.useState(0);
    const [tailCounter, setTailCounter] = React.useState(0);

    const flipCoin = () => {

        let flipResult = Math.random();

        if (flipResult <= 0.5) {
            setCoinResult('animate-tails');
            setTailCounter(tailCounter + 1);
        } else {
            setCoinResult('animate-heads');
            setHeaderCounter(headCounter + 1);
        }
    }

    return (
        <>
            <div className='coin-container'>
                <div id="coin" className={coinResult}>
                    <div className="heads"></div>
                    <div className="tails"></div>
                </div>
                <button id="flip" onClick={() => flipCoin()}>Flip your fate!</button>
                <p>
                    No: <span id="HeadsCount">{headCounter}</span>
                    <br />
                    Yes: <span id="TailsCount">{tailCounter}</span>
                </p>
            </div>
        </>
    )
}

export default Coinflip;