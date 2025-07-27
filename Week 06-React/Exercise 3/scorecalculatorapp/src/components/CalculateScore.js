import '../Stylesheets/CalculateScore.css';

const percentToDecimal = (decimal) => {
  return (decimal.toFixed(2) + '%');
}

const calcScore = (total, goal) => {
  return percentToDecimal(total * 100 / goal);
}

export const CalculateScore = ({ name, school, total, goal }) => {
  return (
    <div className="formatstyle">
      <h1 style={{ color: "brown" }}>Student Details:</h1>
      <div className='Name'>
        <b><span>Name:</span></b>
        <span>{name}</span>
      </div>
      <div className='School'>
        <b><span>School:</span></b>
        <span>{school}</span>
      </div>
      <div className='Total'>
        <b><span>Total:</span></b>
        <span>{total}</span>
      </div>
      <div className='Score'>
        <b><span>Score:</span></b>
        <span>{calcScore(total, goal)}</span>
      </div>
    </div>
  );
}