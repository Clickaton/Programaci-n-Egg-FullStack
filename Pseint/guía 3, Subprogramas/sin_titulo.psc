//Escribir un programa que calcule cu�ntos d�gitos tiene un n�mero entero positivo sin
//convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
//		investigar la funci�n trunc().

Algoritmo sin_titulo
	definir num, i, resto Como Entero
	escribir "escribir el n�mero para saber cuantos d�gitos tiene"
	leer num
	
	resto= num % 10
	escribir resto
	Mientras resto > 0
		
	FinMientras
FinAlgoritmo
