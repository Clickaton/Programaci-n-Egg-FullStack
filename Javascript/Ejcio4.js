const readlineSync = require("readline-sync");

const letra = readlineSync.question("Por favor, ingrese un caracter: S O N ").toUpperCase();

if (letra === "S" || letra=== "N") {
console.log("Caracter correcto")
} else{
    console.log("Caracter incorrecto");
}

