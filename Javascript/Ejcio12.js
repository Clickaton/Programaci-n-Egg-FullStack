/**12. Escribir una función flecha de JavaScript que reciba un argumento y retorne el tipo de
dato. */

tipoDeDato = (dato) => {
    return typeof dato;
  }
  var indefinido;

console.log(tipoDeDato("Hola")); 
console.log(tipoDeDato(3.14)); 
console.log(tipoDeDato(true)); 
console.log(tipoDeDato(indefinido));