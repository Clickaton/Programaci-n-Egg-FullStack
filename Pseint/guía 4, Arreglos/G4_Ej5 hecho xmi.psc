Funcion busqueda_numMayor <- numMayor ( vector Por Referencia, n Por Referencia, i Por Referencia)
	Definir numM Como Entero
	numM=0
	//Utilizo "Bucle para" con el objetivo de que se almacene en la variable "numM" el vector(i) mas grande
	//Y si el próximo elemento "vector(i) no es mayor al anterior, se mantiene el mismo hasta la próxima vuelta
	para i<-0 hasta n-1 Hacer  
		si vector(i)>numM Entonces
			numM=vector(i)
		FinSi
	FinPara
	Escribir ""
	Escribir "El valor mayor del vector es: " numM
	
Fin Funcion

//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario. A continuación, se deberá crear una función que reciba el vector y devuelva el valor
//más grande del vector.

Algoritmo G4_Ej5
	definir vector, n, resultado, i Como Entero
	Escribir "Ingrese el tamaño del vector:"
	leer n
	Dimension vector(n)
	
	para i<-0 hasta n-1 Hacer
		Escribir "Ingrese el valor del  elemento ",i+1 " del vector:"
		leer vector(i)
		Escribir "El indice ",i+1 " del vector es ",vector(i)
	FinPara
	
	Escribir "Los valores del vector elegidos son:"
	para i<-0 hasta n-1 Hacer
		Escribir vector(i),", " Sin Saltar
	FinPara
	Escribir ""
	
	resultado=numMayor(vector, n, i)
	
	
FinAlgoritmo
