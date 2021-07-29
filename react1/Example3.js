import React from 'react';
import ReactDOM from 'react-dom';
//import './App.css';

class Toggle extends React.Component {
    constructor(props) {
        super(props);
        this.state = {isToggleOn: true};

        this.handleClick = this.handleClick.bind(this);
}

handleClick(){
    this.setState(prevState => ({
        isToggleOn: !prevState.isToggleOnis
    }));
}

render() {
    return (
        <button onClick = {this.handleClick}>
            {this.state.isToggleOn ? 'ON' : 'OFF'}
        </button>
    );
    }
}

ReactDOM.render(
    <Toggle />,
    document.getElementById('root')
);

export default Toggle;