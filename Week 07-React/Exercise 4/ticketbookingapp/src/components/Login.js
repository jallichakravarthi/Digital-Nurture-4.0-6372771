import React from "react";

const Login = (props) => {
    return (
        <div style={{ textAlign: "center", padding: "10px" }}>
        <button onClick={props.onClick} style={{ backgroundColor: "#BA55D3",fontSize: "20px", fontWeight: "bold", padding: "10px", borderRadius: "5px" }}>Login</button>
        </div>
    );
}

export default Login;
