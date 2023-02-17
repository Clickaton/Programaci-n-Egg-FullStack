Funcion SumaDeDivisores <- respuesta ( num )
	Definir Cont, suma, SumaDeDivisores Como Entero
	suma=0
	para Cont=1 Hasta num
		si num mod Cont = 0 Entonces
			suma=suma+Cont
		FinSi
	FinPara
	SumaDeDivisores=suma-num
	
	
Fin Funcion

//Realizar una función que calcule y retorne la suma de todos los divisores del número n
//distintos de n. El valor de n debe ser ingresado por el usuario.
Algoritmo ExtraG3_ej1
	definir num Como Entero
	Escribir "Ingrese un número"
	leer num
	
	Escribir respuesta(num)

	
FinAlgoritmo
