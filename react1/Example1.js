import React from 'react';
import ReactDOM from 'react-dom';
//import logo from './logo.svg';
//import './App.css';

function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}

function App1() {
  return (
    <div>
      <Welcome name="Saha" />
      <Welcome name="Charl" />
      <Welcome name="Edit" />
    </div>
  );
}
ReactDOM.render(
  <App1 />,
  document.getElementById('root')
);

export default App1;