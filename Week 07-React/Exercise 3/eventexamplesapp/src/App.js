import './App.css';
import Counter from './components/Counter';
import CurrencyConvertor from './components/CurrencyConvertor';

function App() {
  return (
    <div >
      <Counter />
      <hr style={{ margin: "10px" }}></hr>
      <CurrencyConvertor />
    </div>  
  );
}

export default App;
