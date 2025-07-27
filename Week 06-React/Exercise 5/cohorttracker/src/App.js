import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  const cohorts = [
    {
      name: 'ReactJS Bootcamp',
      status: 'ongoing',
      startDate: '2025-06-01',
      endDate: '2025-08-01',
    },
    {
      name: 'Spring Boot Deep Dive',
      status: 'completed',
      startDate: '2025-01-15',
      endDate: '2025-03-30',
    },
    {
      name: 'Full Stack Development',
      status: 'ongoing',
      startDate: '2025-04-10',
      endDate: '2025-07-20',
    }
  ];

  return (
    <div>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
