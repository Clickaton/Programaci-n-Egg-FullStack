process.stdout.write("Por favor para ingresar necesitamos validar su edad");
process.stdin.on("data", function (data) {
    const readlineSync = require("readline-sync");
    const edad = readlineSync.question("Por favor para ingresar necesitamos validar su edad");
    
    if (edad >= 18) {
        console.log("Bienvenido! Usted es mayor de edad");
    } else{
        console.log("Lo sentimos. Usted es menor de edad");
    }
    
})