//Escribir un programa que calcule cuántos dígitos tiene un número entero positivo sin
//convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
//		investigar la función trunc().

Algoritmo sin_titulo
	definir num, i, resto Como Entero
	escribir "escribir el número para saber cuantos dígitos tiene"
	leer num
	
	resto= num % 10
	escribir resto
	Mientras resto > 0
		
	FinMientras
FinAlgoritmo
