import React, { useState } from "react";
import UserPage from "./pages/UserPage";
import GuestPage from "./pages/GuestPage";
import Login from "./components/Login";
import Logout from "./components/Logout";

const Greetings = () => {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const handleLogin = () => {
    setIsLoggedIn(true);
  };
  const handleLogout = () => {
    setIsLoggedIn(false);
  };
  return (
    <div style={{ minHeight: "100vh", display: "flex", justifyContent: "center", background: "#f5f5f5" , paddingTop: "20px", backgroundColor: "plum"}}>
      <div style={{ height: "300px", width: "900px", border: "3px solid #ddd", padding: "10px", borderRadius: "15px", margin: "10px", backgroundColor: "pink", display: "flex", flexDirection: "column", justifyContent: "center", alignItems: "center" }}>
        {isLoggedIn ? (
          <div style={{ padding: "10px", width: "100%" }}>
            <UserPage />
            <Logout onClick={handleLogout} />
          </div>
        ) : (
          <div style={{ padding: "10px", width: "100%" }}>
            <GuestPage />
            <Login onClick={handleLogin} />
          </div>
        )}
      </div>
    </div>
  );
};

export default Greetings;
