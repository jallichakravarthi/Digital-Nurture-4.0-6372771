import React from "react";

const Logout = (props) => {
    return (
        <div style={{ textAlign: "center", padding: "10px" }}>
        <button onClick={props.onClick} style={{ backgroundColor: "#BA55D3",fontSize: "20px", fontWeight: "bold", padding: "10px", borderRadius: "5px" }}>Logout</button>
        </div>
    );
}

export default Logout;