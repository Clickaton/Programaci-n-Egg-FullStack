/**8. Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
todos ellos. */
const readlineSync = require("readline-sync");
var num = parseInt(readlineSync.question("Por favor, ingrese un numero entero: "));
var num2 = 0;

do{
if (Number.isInteger(num)){
    if(num > num2){
        num2 = num;
    }
    num = parseInt(readlineSync.question("Por favor, ingrese un numero entero: ")); 
} else {
    console.log("El valor introducido es invalido.");
    num = parseInt(readlineSync.question("Por favor, ingrese un numero entero: ")); 
}
}while(num != 0);

console.log(`El número mas alto que se introdujo es: ${num2}`);