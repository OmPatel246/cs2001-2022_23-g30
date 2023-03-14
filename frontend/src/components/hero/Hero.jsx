import React from 'react';
import './HeroStyles.css'
import Video from '../../assets/fooddonation.mp4'
import {AiOutlineSearch} from "react-icons/ai";
function Hero(props) {
    return (
        <div className='hero'>
            <video autoPlay loop muted id='video'>
                <source src={Video} type='video/mp4' />
            </video>
            <div className="overlay"></div>
            <div className="content">
                <h1>Our Charity Website</h1>
                <h2>Help advance the world</h2>
                <form className="form">
                    <div>
                        <input type="text" placeholder='Search'/>
                    </div>
                    <div>
                        <button><AiOutlineSearch className='icons'/> </button>
                    </div>
                </form>
            </div>
        </div>
    );
}

export default Hero;