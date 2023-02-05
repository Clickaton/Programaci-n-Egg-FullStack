//Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta entre las letras "M" y "T". 
//Recordar que Pseint le da un valor numérico a cada letra a través del Código Ascii,
//lo que nos deja usar operadores relacionales con letras y cadenas.
Algoritmo ejercicio10extra_busquedaletra
	definir letra Como Caracter
	Leer  letra
	letra = Mayusculas(letra)
	escribir ""
	comparacionletras(letra)
FinAlgoritmo
SubProceso comparacionletras(letra Por Valor)
	definir caract Como Entero
	caract = 0
	Segun letra Hacer
		'M':caract=77
		'N':caract=78
		'O':caract=79
		'P':caract=80
		'Q':caract=81
		'R':caract=82
		'S':caract=83
		'T':caract=84	
		De Otro Modo:
			caract=0
	Fin Segun
	Si caract >=77 y caract <= 84 Entonces
		Escribir "La letra: ",letra, " Se encuentra entre M Y T"
	SiNo
		Escribir "La letra: ",letra, " No se encuentra entre M Y T"
	FinSi
FinSubProceso
	