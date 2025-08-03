import React from "react";
import "./OfficeSpaceList.css";

const officeSpaces = [
  {
    id: 1,
    name: "Skyline Tower",
    rent: 55000,
    address: "123 Main St, City Center",
    image: "https://images.unsplash.com/photo-1506744038136-46273834b3fb?auto=format&fit=crop&w=400&q=80"
  },
  {
    id: 2,
    name: "Green Valley Plaza",
    rent: 65000,
    address: "456 Elm St, Business Bay",
    image: "https://images.unsplash.com/photo-1464983953574-0892a716854b?auto=format&fit=crop&w=400&q=80"
  },
  {
    id: 3,
    name: "Tech Park",
    rent: 70000,
    address: "789 Oak St, Tech City",
    image: "https://images.unsplash.com/photo-1508921912186-1d1a45ebb3c1?auto=format&fit=crop&w=400&q=80"
  }
];

const OfficeSpaceList = () => {
  return (
    <div className="office-list-root">
      <h1>Office Space Rental</h1>
      <div className="office-list">
        {officeSpaces.map((office) => (
          <div className="office-card" key={office.id}>
            <img className="office-img" src={office.image} alt={office.name} />
            <h2>{office.name}</h2>
            <p><strong>Address:</strong> {office.address}</p>
            <p>
              <strong>Rent:</strong> <span style={{ color: office.rent < 60000 ? 'red' : 'green' }}>{office.rent}</span>
            </p>
          </div>
        ))}
      </div>
    </div>
  );
};

export default OfficeSpaceList;
