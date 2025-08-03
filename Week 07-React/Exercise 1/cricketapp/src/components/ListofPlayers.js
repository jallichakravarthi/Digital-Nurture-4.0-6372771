import React from "react";
import './ListofPlayers.css';

const players = [
  { name: "Virat Kohli", score: 85 },
  { name: "Rohit Sharma", score: 65 },
  { name: "KL Rahul", score: 72 },
  { name: "Shikhar Dhawan", score: 55 },
  { name: "Hardik Pandya", score: 90 },
  { name: "Ravindra Jadeja", score: 40 },
  { name: "Jasprit Bumrah", score: 78 },
  { name: "Rishabh Pant", score: 88 },
  { name: "Shreyas Iyer", score: 69 },
  { name: "Bhuvneshwar Kumar", score: 60 },
  { name: "Yuzvendra Chahal", score: 74 }
];

const ListofPlayers = () => {
  // Filter players with score below 70
  const below70 = [];
  players.map(player => {
    if(player.score<70){
        below70.push(player);
    }
  });

  return (
    <div className="listofplayers-root">
      <h2>All Players</h2>
      <ul>
        {players.map((player, idx) => (
          <li key={idx}>{player.name} - Score: {player.score}</li>
        ))}
      </ul>
      <h3>Players with score below 70</h3>
      <ul>
        {below70.map((player, idx) => (
          <li key={idx}>{player.name} - Score: {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
