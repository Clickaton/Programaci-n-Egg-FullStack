const readlineSync = require("readline-sync"); //Este es el Scanner

const estadoDia = readlineSync.question('¿Cómo está el día de hoy? ');

console.log(`El día de hoy está ${estadoDia}`);