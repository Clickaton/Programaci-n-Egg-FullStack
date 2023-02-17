//Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
//La variable A, debe terminar con el valor de la variable B.
SubProceso intercambio(a,b)
	definir c Como Entero
	c=a
	a=b
	b=c
	Escribir "El valor de (A) es: ", A
	Escribir "El valor de (B) es: ", B
	
FinSubProceso

Algoritmo ejercicio6_3_Grupal
	definir a,b Como Entero 

		escribir "Ingrese el valor de a"
		leer a
		Escribir "Ingrese el valor de b"
		leer b
		
	
	
	intercambio(a,b)

	
FinAlgoritmo
