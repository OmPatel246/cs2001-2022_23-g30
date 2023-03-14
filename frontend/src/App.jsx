import React from "react";
import { BrowserRouter, Routes, Route, Switch } from "react-router-dom";

import Router from "./Router";
import Homepage from "./components/Homepage";
import DataAnalytics from "./DataAnalytics/DataAnalytics";
import FoodList from "./FoodList/FoodList";
import FoodDetails from "./FoodDetails/FoodDetails";

function App() {
    //import your page and use this the path where is view how it has been rendered
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Router />}>
                    <Route index element={<Homepage />} />
                    <Route path="DataAnalytics" element={<DataAnalytics />} />
                    <Route path="FoodList" element={<FoodList />} />
                    <Route path ="FoodDetails" element= {<FoodDetails />} />
                </Route>
            </Routes>
        </BrowserRouter>
    );
}

export default App;