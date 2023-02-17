//Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los
//muestre por pantalla.

Algoritmo ejercicio1_Guia4
	
	Dimension valores(5)
	definir  i, valores Como Entero
	
	Escribir "dime 5 valores "
	Para i=0 hasta 4
		Leer valores(i)
	FinPara
	
	Escribir "los valores ingresados son"
	
	Para i = 0 Hasta 3
		Escribir Sin Saltar valores(i),", "
	FinPara
	
	Escribir valores(4) "."
	
FinAlgoritmo
