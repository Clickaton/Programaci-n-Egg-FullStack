//	Escribir un programa que calcule cu�ntos d�gitos tiene un n�mero entero positivo sin
//convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
//		investigar la funci�n trunc().

Algoritmo sin_titulo
	
	
	Definir num, i, auxiliar Como real
	Escribir "dime un numero y te dire cuantos digitos tiene"
	Leer num
	
	
	i = 1
	
	Mientras trunc(num) > 1
		
		num=num/10
		i=i+1
		
	FinMientras
	
	Escribir " tiene ",i," digitos"
	
	
	

FinAlgoritmo
