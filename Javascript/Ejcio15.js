/**15. Escribe un programa JavaScript para calcular el área y el perímetro de un objeto Círculo
con la propiedad radio. Nota: Cree dos métodos para calcular el área y el perímetro. El
radio del círculo lo proporcionará el usuario. */

const readlineSync = require("readline-sync");

circulo = {
    radio: 0,
    calcularArea: function() {
      return Math.PI * this.radio * this.radio;
    },
    calcularPerimetro: function() {
      return 2 * Math.PI * this.radio;
    }
};
circulo.radio = parseFloat(readlineSync.question("Ingrese el radio del círculo:"));
console.log("El área del círculo es: " + circulo.calcularArea().toFixed(2));
console.log("El perímetro del círculo es: " + circulo.calcularPerimetro().toFixed(2));