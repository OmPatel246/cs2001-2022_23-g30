import React, {useState} from 'react';
import {BiSearch} from "react-icons/bi";
import {BsPerson} from "react-icons/bs";
import {HiOutlineMenuAlt4} from "react-icons/hi";
import {AiOutlineClose} from "react-icons/ai"

import './navbarStyles.css'
import {FaFacebook, FaInstagram, FaPinterest, FaTwitter, FaYoutube} from "react-icons/fa";
import {Link} from "react-router-dom";


function Navbar(props) {
    const [nav, setNav] = useState(false)
    const handleNav = () => setNav(!nav)


    return (
        <>
        <div className={nav ? 'navbar navbar-bg': 'navbar'}>
            <div className={nav ? 'logo dark' : 'logo'}>
                <h2>Charity Site</h2>
            </div>
            <ul className='nav-menu'>
                <li>Home</li>
                <li><Link to="/FoodList" style={{ color: "white"}}>Food List</Link></li>
                <li>User Reg</li>
                <li><Link to="/DataAnalytics" style={{ color: "white"}}>Data Analytics</Link></li>
                <li><Link to = "/FoodDetails" style = {{color: 'white'}}>Food Details</Link> </li>
                <li>Doner Form</li>
                <li>FAQ Form</li>
            </ul>
            <div className="nav-icons">
                <BiSearch className='icon' style={{marginRight: '1rem'}}/>
                <BsPerson className='icon'/>
            </div>
            <div className="hamburger" onClick={handleNav}>
                {!nav ? (<HiOutlineMenuAlt4 className={'icon'}/>) :<AiOutlineClose style={{color: 'black' }} className='icon'/> }

            </div>

            <div className={nav ? 'mobile-menu active' : 'mobile-menu'}>

                <ul className="mobile-nav">
                    <li>Home</li>
                    <li><Link to="/FoodList" style={{ color: "black"}}>Food List</Link></li>
                    <li>User Reg</li>
                    <li><Link to="/DataAnalytics" style={{ color: "black"}}>Data Analytics</Link></li>
                    <li>Doner Form</li>
                    <li>FAQ Form</li>
                </ul>
                <div className="mobile-menu-button">
                    <div className="menu-icons">
                        <button>Search</button>
                        <button>Account</button>
                    </div>
                    <div className="social-icons">
                        <FaInstagram className='icons' />
                        <FaFacebook className='icons' />
                        <FaTwitter className='icons' />
                        <FaYoutube className='icons' />
                        <FaPinterest className='icons' />
                    </div>
                </div>
            </div>

        </div>
        </>
    );
}

export default Navbar;