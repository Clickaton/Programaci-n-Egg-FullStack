Algoritmo guia2_2_ejercicio_bucle3
	
	//	Dada una secuencia de números ingresados por teclado que finaliza con un -1, por
	//ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,......,-1; realizar un programa que calcule el promedio de
	//	los números ingresados. Suponemos que el usuario no insertará número negativos.
	
	
	Definir num, suma, i Como Entero
	Escribir " ingrese un numero "
	Leer num
	suma=0
	i=1
	Mientras (num>=0) Hacer
		suma=suma+num
		i=i+1
		Leer num
	FinMientras
	Escribir suma/(i-1)
FinAlgoritmo
