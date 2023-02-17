//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase.
//La función debe devolver la cantidad de veces que encontró la letra.
///Nota: recordar el uso de la función Subcadena().

Algoritmo sin_titulo
	
	Definir frase, letra Como Caracter
	
	Escribir "Ingrese una frase"
	Leer frase
	
	Escribir "Ingrese una letra a buscar"
	leer letra
	
	Escribir "La cantidad de veces que la letra " letra " esta en la frase es igual a: " buscar(frase, letra)
	
FinAlgoritmo

Funcion Resultado <- buscar(frase, letra)
	
	Definir cont1, cont2 Como Entero
	Definir Resultado Como Entero
	Resultado=0
	cont1=0
	cont2=0
	
	Repetir
		
		Si SubCadena(frase,cont2,cont2)=letra Entonces
			cont1=cont1+1
		Fin Si
		
		cont2=cont2+1
		
	Mientras Que cont2<=Longitud(frase)
	
	Resultado=cont1
	
Fin Funcion

