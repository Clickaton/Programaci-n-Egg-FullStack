//Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y
//los muestre por pantalla.
Algoritmo ejercicio8matriz
	definir matriz,i,j Como Entero
	Dimension matriz(3,3)
	para i=0 Hasta 2 Hacer
		para j = 0 hasta 2 hacer
			escribir "Ingresa un valor (",i+1,",",j+1,") " Sin Saltar
			leer matriz(i,j)
		FinPara
	FinPara
	escribir""
	para i=0 Hasta 2 Hacer
		para j = 0 hasta 2 hacer
			escribir sin saltar " ", matriz(i,j)
		FinPara
		escribir ""
	FinPara 
	
	
FinAlgoritmo
