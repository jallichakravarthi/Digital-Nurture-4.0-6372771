import React from "react";
import './IndianPlayers.css';

const oddTeamPlayers = [
  "Virat Kohli",
  "KL Rahul",
  "Hardik Pandya",
  "Jasprit Bumrah",
  "Shreyas Iyer",
  "Yuzvendra Chahal"
];

const evenTeamPlayers = [
  "Rohit Sharma",
  "Shikhar Dhawan",
  "Ravindra Jadeja",
  "Rishabh Pant",
  "Bhuvneshwar Kumar"
];

// Destructuring
const [...odd] = oddTeamPlayers;
const [...even] = evenTeamPlayers;

// Merge arrays
const T20players = ["Surya Kumar Yadav", "Ishan Kishan", "Deepak Chahar"];
const RanjiTrophyPlayers = ["Prithvi Shaw", "Hanuma Vihari", "Mayank Agarwal"];
const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

const IndianPlayers = () => {
  return (
    <div className="indian-players-root">
      <h2>Odd Team Players (Destructured)</h2>
      <ul>
        {odd.map((player, idx) => (
          <li key={idx}>{player}</li>
        ))}
      </ul>
      <h2>Even Team Players (Destructured)</h2>
      <ul>
        {even.map((player, idx) => (
          <li key={idx}>{player}</li>
        ))}
      </ul>
      <h2>Merged Players (T20 + Ranji Trophy)</h2>
      <ul>
        {mergedPlayers.map((player, idx) => (
          <li key={idx}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
