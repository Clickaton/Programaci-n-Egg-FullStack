/* 6. Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
En caso de que el valor ingresado sea 0, se debe mostrar “el número no es par ni impar”.*/

const readlineSync = require("readline-sync");
var num = readlineSync.question("Por favor, ingrese un número: ");

if (num % 2 === 0 && num != 0) {
console.log("El número es par")
} if(num == 0) {
    console.log("El número no es par ni impar")
}
 else {
    console.log("El numero es impar")
};