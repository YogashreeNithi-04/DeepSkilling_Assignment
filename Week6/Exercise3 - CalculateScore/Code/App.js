import { CalculateScore } from './Component/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore 
        Name="Sundar" 
        School="AVS Public School" 
        total={284} 
        goal={3} 
      />
    </div>
  );
}

export default App;