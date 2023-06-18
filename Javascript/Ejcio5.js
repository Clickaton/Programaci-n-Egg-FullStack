/*5. Construir un programa que simule un menú de opciones para realizar las cuatro
operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
numéricos enteros. El usuario, además, debe especificar la operación con el primer
carácter de la operación que desea realizar: ‘S' o ‘s’ para la suma, ‘R’ o ‘r’ para la resta, ‘M’
o ‘m’ para la multiplicación y ‘D’ o ‘d’ para la división.*/

const readlineSync = require("readline-sync");
var resultado = undefined;
var opcion;

do{
console.log('Bienvenido al MENU');
console.log('1. SUMAR');
console.log('2. RESTAR');
console.log('3. MULTIPLICAR');
console.log('4. DIVIDIR');
console.log('5. SALIR')
console.log('Por favor ingrese la opción que desea utilizar')
opcion = parseInt(readlineSync.question());

switch (opcion) {
    case 1:
        var num1 = parseInt(readlineSync.question('Ingrese el valór del primer número: '));
        var num2 = parseInt(readlineSync.question('Ingrese el valór del segundo número: '));
        resultado = (num1 + num2);
        console.log('El resultado es ' + resultado);
        break;
    case 2:
        var num1 = parseInt(readlineSync.question('Ingrese el valór del primer número: '));
        var num2 = parseInt(readlineSync.question('Ingrese el valór del segundo número: '));
        resultado = (num1 - num2);
        console.log('El resultado es ' + resultado);    
        break;
    case 3:
        var num1 = parseInt(readlineSync.question('Ingrese el valór del primer número: '));
        var num2 = parseInt(readlineSync.question('Ingrese el valór del segundo número: '));
        resultado = (num1 * num2);
        console.log('El resultado es ' + resultado);  
        break;
    case 4:
        var num1 = parseInt(readlineSync.question('Ingrese el valór del primer número: '));
        var num2 = parseInt(readlineSync.question('Ingrese el valór del segundo número: '));
        resultado = (num1 / num2);
        console.log('El resultado es ' + resultado);  
        break;
    case 5:
        console.log('Hasta luego!');
        break;    
    default:
        console.log('Opción incorrecta, por favor vuelva a intentarlo');
        break;
    }

} while (opcion != 5);