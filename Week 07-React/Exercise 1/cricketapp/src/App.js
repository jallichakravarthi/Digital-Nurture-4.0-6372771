import './App.css';
import ListofPlayers from './components/ListofPlayers';
import IndianPlayers from './components/IndianPlayers';
import { useState } from 'react';

function App() {
  // Toggle this flag to switch components
  const [flag,setFlag] = useState(true); // set to false to show IndianPlayers

  return (
    <div className="App">
      <h1>Cricket App</h1>
      <div style={{ textAlign: 'left', margin: '10px'}}>
        <button onClick={() => setFlag(!flag)}>Toggle</button>
      </div>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
