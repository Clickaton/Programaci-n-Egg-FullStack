/*var edad = prompt("Qué edad tenés?", 29);

var mensaje = `La edad del sujeto es 
....
.... ${edad}`;

alert(mensaje);*/
var persona = {
    nombre: "Juan",
    apellido: "Perez",
    nacimiento : new Date("04-10-1996"),
    dni: 38756315,
    edad: 29,
    mascota: [
        {
        apodo: "Chiquito",
        númeroIdentificatorio: 123412,
        nacimiento : new Date("01-02-2006")
        },{
        apodo: "Adara",
        númeroIdentificatorio: 321124,
        nacimiento : new Date("05-01-2005")
        }
    ]
};

// var mascota = {
//     apodo: "Chiquito",
//     númeroIdentificatorio: 123412,
//     nacimiento : new Date("01-02-2006")
// };

class Mascota {
    apodo;
    numeroIdentificatorio;
}

var m = new Mascota();
m.apodo = "Filomena";
m.numeroIdentificatorio = 32342;

console.log(persona.mascota[0].apodo);
console.log(m);