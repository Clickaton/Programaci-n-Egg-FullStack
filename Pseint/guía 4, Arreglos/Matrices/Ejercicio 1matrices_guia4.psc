//1. Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y
//los muestre por pantalla.
Algoritmo Ejercicio_1_matrices_guia4
	definir vector, i , j  Como real
	Dimension vector(3,3)
	para i<-0 hasta 2 Hacer // Esta es la formula base de las matrices para ingresar valores
		para j <-0 hasta 2 Hacer
			Escribir " Ingrese los valores para la matriz ", i , j
			leer vector(i,j)
			
		FinPara
	FinPara
	para i<-0 hasta 2 Hacer// Y esta es la formula para imprimir los valores
		para j <-0 hasta 2 Hacer
			Escribir vector(i,j), " " sin saltar
		FinPara
		escribir " " // esto se pone para que se realize el salto de linea y quede las columnas y filas deseadas
	FinPara
	
FinAlgoritmo
