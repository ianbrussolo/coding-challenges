const prompt = require('prompt-sync')({ sigint:true });
let userChoice = prompt("Your choice: ");

const getUserChoice = userInput => {
    userInput = userInput.toLowerCase();
    if (userInput === 'rock' || userInput === 'paper' || userInput === 'scissors') {
      return userInput;
    } else {
      console.log('Error!');
    }
};
  
const getComputerChoice = () => {
    let number = Math.floor(Math.random() * 3);
    switch (number) {
    case 0:
        return 'rock';
        break;
    case 1:
        return 'paper';
        break;
    case 2:
        return 'scissors';
        break;
    }
};
let computerChoice = getComputerChoice();

const determineWinner = (userChoice, computerChoice) => {
    console.log(`${userChoice} vs ${computerChoice}`);
    if (userChoice === computerChoice) {
    return 'The game is a tie!';
    }
    if (userChoice === 'rock') {
    if (computerChoice === 'paper') {
        return 'The computer won!';
    } else {
        return 'You won!';
    }
    }
    if (userChoice === 'paper') {
    if (computerChoice === 'scissors') {
        return 'The computer won!';
    } else {
        return 'You won!';
    }
    }
    if (userChoice === 'scissors') {
    if (computerChoice === 'rock') {
        return 'The computer won!';
    } else {
        return 'You won!';
    }
    }
};

console.log(determineWinner(userChoice, computerChoice));