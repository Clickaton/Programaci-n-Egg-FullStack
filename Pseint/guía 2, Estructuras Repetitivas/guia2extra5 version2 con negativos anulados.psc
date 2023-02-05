Algoritmo guia2extra5
	//Escribir un programa que calcule cuántos dígitos tiene un número entero positivo sin
	//convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
	//investigar la función trunc().
	Definir num, acumulador Como Entero
	acumulador = 0
	leer num
	
	si num > 0 Entonces
		mientras trunc(num) <> 0
			num = trunc(num / 10)
			acumulador = acumulador + 1
		FinMientras
	FinSi
	Escribir acumulador
FinAlgoritmo
