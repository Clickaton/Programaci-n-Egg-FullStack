Algoritmo ejercicio10
	definir num1 Como real
	definir num2 Como real
	escribir "Por favor ingrese un número entero:"
	leer num1
	num2=0
	
	si num1 = num2
		escribir "el número no es par ni impar"
	SiNo
		si num1 mod 2 = 0
			escribir "El número es par"
		SiNo
			si num1 mod 2 = 1
				escribir "el número es impar"
			FinSi
		FinSi
	FinSi

	
	
FinAlgoritmo
