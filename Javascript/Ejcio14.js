/**14. Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor,
Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario
y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas. */

const readlineSync = require("readline-sync");


libro = {
    ISBN: "",
    titulo: "",
    autor: "",
    numPaginas: 0,
    cargarLibro: function() {
this.ISBN = readlineSync.question("Por favor ingrese el ISBN del libro:");
this.titulo = readlineSync.question("Por favor ingrese el título del libro:");
this.autor = readlineSync.question("Por favor ingrese el autor del libro:");
this.numPaginas = parseInt(readlineSync.question("Por favor ingrese el número de páginas del libro:"));
    },
    mostrarLibro: function() {
console.log("ISBN: " + this.ISBN);
console.log("Título: " + this.titulo);
console.log("Autor: " + this.autor);
console.log("Número de páginas: " + this.numPaginas);
    }
};


// LLamado de las funciones:
libro.cargarLibro();
libro.mostrarLibro();