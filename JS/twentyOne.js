const prompt = require('prompt-sync')({ sigint:true });

const types = ['diamond', 'spade', 'heart', 'club'];
const cards = ['A', '2', '3', '4', '5', '6', '7', '8', '9', '10', 'Q', 'J', 'K'];
const deck = [];

let d = 0;
for (let i = 0; i < cards.length; i++) {
    for (let j = 0; j < types.length; j++) {
        deck.push(cards[i] + ' of ' + types[j]);
        console.log(deck[d]);
        d++;
    }
}

const values = [];

for (d = 0; d < deck.length; d++) {
    if (getNumberAtStart(deck[d]) !== null) {
        let num = deck[d].replace(/[^0-9]/g, '');
        console.log(num + 2);
        values[d] = getNumberAtStart(deck[d]);
    }
}
//let userChoice = prompt("Your choice: ");