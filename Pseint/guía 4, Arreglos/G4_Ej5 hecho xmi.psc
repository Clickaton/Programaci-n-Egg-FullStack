Funcion busqueda_numMayor <- numMayor ( vector Por Referencia, n Por Referencia, i Por Referencia)
	Definir numM Como Entero
	numM=0
	//Utilizo "Bucle para" con el objetivo de que se almacene en la variable "numM" el vector(i) mas grande
	//Y si el pr�ximo elemento "vector(i) no es mayor al anterior, se mantiene el mismo hasta la pr�xima vuelta
	para i<-0 hasta n-1 Hacer  
		si vector(i)>numM Entonces
			numM=vector(i)
		FinSi
	FinPara
	Escribir ""
	Escribir "El valor mayor del vector es: " numM
	
Fin Funcion

//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario. A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el valor
//m�s grande del vector.

Algoritmo G4_Ej5
	definir vector, n, resultado, i Como Entero
	Escribir "Ingrese el tama�o del vector:"
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
