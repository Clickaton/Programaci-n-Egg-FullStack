/**Escribir una función flecha que reciba una palabra y la devuelva al revés. */

const readlineSync = require("readline-sync");
var palabra = readlineSync.question("Por favor ingrese una palabra:");
palabraInvertida = (palabra) => {
    let resultado = "";
    for (let i = palabra.length - 1; i >= 0; i--) {
      resultado += palabra[i];
    }
    return resultado;
  }
  
  console.log(palabraInvertida(palabra)); 