/**11. Escribir una función que reciba un String y devuelva la palabra más larga.
String Ejemplo: “Guia de JavaScript”
Resultado esperado : “JavaScript” */
const readlineSync = require("readline-sync");
const frase = readlineSync.question("Por favor ingrese una frase:");
 palabraMasLarga = (cadena) => {
  let palabras = cadena.split(" ");
  let palabraLarga = "";
  for (let i = 0; i < palabras.length; i++) {
    if (palabras[i].length > palabraLarga.length) {
      palabraLarga = palabras[i];
    }
  }
  return palabraLarga;
}
// Ejemplo de uso
console.log(palabraMasLarga(frase));