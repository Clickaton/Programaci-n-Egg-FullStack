const readlineSync = require("readline-sync"); //Este es el Scanner
const opc= readlineSync.question("Seleccione una figura: 1_cuadrado, 2_triangulo, 3_circulo: "); 


switch(opc) {
    case "1":
        const lado1 = readlineSync.question("Ingrese el lado 1: ");
        cuadrado(lado1);
        break;

    case "2":
        const base = readlineSync.questionInt("Ingrese la base del triángulo ");
        const altura = readlineSync.questionInt("Ingrese la altura del triángulo: ");
        const ladoA = readlineSync.questionInt("Ingrese el lado A: del triángulo: ");
        const ladoB =  readlineSync.questionInt("Ingrese el lado B: del triángulo: ");
        triangulo(base, altura, ladoA, ladoB);
        break;
    case "3":
        const radio = readlineSync.question("Ingrese el radio del circulo: ");    
        circulo(radio);
        break;
    default:
        console.log("Opcion no válida");
        break;
}        

    function cuadrado(lado1) {
        const area = lado1*lado1;
        const perimetro = lado1 * 4;
        console.log(`El area del cuadrado es: ${area}`);
        console.log(`El perimetro del cuadrado es: ${perimetro}`);
    }

    function triangulo(base, altura, ladoA, ladoB) {
        const area = (base*altura)/2;
        const perimetro = (base + ladoA + ladoB);
        console.log(`El area del triángulo es: ${area}`);
        console.log("El perímetro del triángulo es: " + perimetro);
    }

    function circulo(radio) {   
        const area = Math.PI * radio * radio;
        const perimetro = 2 * Math.PI * radio;
        console.log(`El area del circulo es: ${area}`);
        console.log(`El perímetro del circulo es: ${perimetro}`);
    }