import React from "react";
import { useState } from "react";

const CurrencyConvertor = () => {
    const [amount, setAmount] = useState(0);
    const [currency, setCurrency] = useState("usd");
    const [convertedAmount, setConvertedAmount] = useState(0);
    const convert = () => {
        if(currency === "usd") {
            setConvertedAmount( amount * 0.011);
        } else if(currency === "eur") {
            setConvertedAmount( amount * 0.0100);
        } else {
            setConvertedAmount( amount * 0.0086);
        }
    }
    return (
        <div style={{ padding: "10px" }}>
            <h1 style={{ textAlign: "center", color: "Green", fontSize: "30px" , padding: "10px" , margin: "10px"   }}>Currency Convertor</h1>
            <div style={{ display: "flex", flexWrap: "wrap", gap: "10px", padding: "10px" }}>
            <input type="text" placeholder="Enter amount" onChange={(e) => setAmount(e.target.value)} style={{ fontSize: "20px", padding: "10px" }} />
            <select onChange={(e) => setCurrency(e.target.value)} style={{ fontSize: "20px", padding: "10px" }}>
                <option value="usd">USD</option>
                <option value="eur">EURO</option>
                <option value="gbp">POUNDS</option>
            </select>
            <button onClick={convert} style={{ fontSize: "20px", padding: "10px", borderRadius: "5px" }}>Convert</button>
            </div>
            <p style={{ textAlign: "left", color: "Green" , fontSize: "20px"}}>Converted Amount: {convertedAmount.toFixed(2)} {currency}</p>
        </div>
    );
};

export default CurrencyConvertor;
