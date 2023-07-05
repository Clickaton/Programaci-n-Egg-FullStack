/*7. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.*/

const readlineSync = require("readline-sync");
var num;
var resultado = 0;

do {
num = readlineSync.question("Por favor, ingrese un valor limite positivo: ");
console.log("Soy un bucle");
} while(num <= 0);

do{
    var num2 = parseInt(readlineSync.question("Por favor, ingrese otro numero:"));
    resultado += num2;
}while( resultado < num);
    
    



