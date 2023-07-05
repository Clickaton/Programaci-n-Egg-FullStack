/**9. Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el
funcionamiento de la función Substring(). */

const readlineSync = require("readline-sync");
var frase = readlineSync.question("Por favor ingrese una frase:");
var resultado = "";

for (let i = 0; i < frase.length; i++) {
resultado += frase.substring(i, i + 1) + " ";
}

console.log(resultado);
