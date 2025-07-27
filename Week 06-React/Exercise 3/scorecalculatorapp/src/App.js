import logo from './logo.svg';
import './App.css';
import { CalculateScore } from './components/CalculateScore';
function App() {
  return (
    <div>
      <CalculateScore name={"Chakravarthi Jalli"} school={"PVPSIT"} total={80} goal={100} />
    </div>
  );
}

export default App;
