import React, { useState } from "react";

const Counter = () => {
  const [count, setCount] = useState(0);
  const [sayHello, setSayHello] = useState(false);
  const [showMessage, setShowMessage] = useState(false);
  const [message, setMessage] = useState("");
  const [clicked, setClicked] = useState(false);

  const handleIncrement = () => {
    setCount(count + 1);
    handleSayHello();
  };
  const handleSayHello = () => {
    setSayHello(true);
    setTimeout(() => {
      setSayHello(false);
    }, 1000);
  };
  const handleDecrement = () => {
    setCount(count - 1);
  };

  const handleShowMessage = (m) => {
    setShowMessage(true);
    setMessage(m);
    setTimeout(() => {
      setShowMessage(false);
    }, 1000);
  };
  return (
    <div style={{ marginBottom: "20px"}}>
      <div style={{ padding: "10px", fontSize: "30px" }}>Counter: {count}</div>
      <div style={{ display: "flex", flexWrap: "wrap", gap: "10px", padding: "10px" }}>
        <button onClick={handleIncrement} style={{ fontSize: "20px", padding: "10px" }}>Increment</button>
        <button onClick={handleDecrement} style={{ fontSize: "20px", padding: "10px" }}>Decrement</button>
        <button onClick={() => handleShowMessage("Welcome User")} style={{ fontSize: "20px", padding: "10px" }}>Say Welcome</button>
      </div>
      <div
        style={{
          display: "flex",
          flexWrap: "wrap",
          gap: "30px",
          padding: "10px",
        }}
      >
        <button
          onClick={() => {
            setClicked(true);
            setTimeout(() => {
              setClicked(false);
            }, 1000);
          }}
          style={{ fontSize: "20px", padding: "10px" }}
        >
          Click Me
        </button>
        {clicked && (
          <p style={{ color: "plum", fontSize: "20px" }}>
            {"<-"} I Was Clicked
          </p>
        )}
      </div>
      <div
        style={{
          display: "flex",
          flexWrap: "wrap",
          gap: "30px",
        }}
      >
        <p style={{ color: "plum", fontSize: "30px" }}>Message:</p>
        {sayHello && (
          <p style={{ color: "plum", fontSize: "30px" }}>Hello User.</p>
        )}
        {showMessage && (
          <p style={{ color: "plum", fontSize: "30px" }}>{message}</p>
        )}
        {(!sayHello && !showMessage) ? <p style={{ color: "plum", fontSize: "30px" }}>No Message</p> : null}
      </div>
    </div>
  );
};

export default Counter;
