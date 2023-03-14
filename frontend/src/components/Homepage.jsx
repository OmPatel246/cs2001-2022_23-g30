import React from 'react';
import Navbar from "./navbar/navbar";
import Hero from "./hero/Hero";
import Footer from "./footer/footer"
import {Link} from "react-router-dom";


function Homepage(props) {
    return (
        <div>
            <Navbar />
            <Hero />
            <Footer />
        </div>
    );
}

export default Homepage;