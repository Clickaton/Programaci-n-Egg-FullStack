//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el 
//usuario. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a buscar 
//tambi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n donde se 
//encuentra el valor. En caso que el n�mero se encuentre repetido dentro del arreglo se deben 
//imprimir todas las posiciones donde se encuentra ese valor. 
//Finalmente, en caso que el n�mero a buscar no est� adentro del arreglo se debe mostrar un 
//mensaje

Algoritmo ej3_G4
	
	definir vector, i, num, num2, c Como entero
	Dimension vector(5)
	Para i<-0 Hasta 4  Hacer
		escribir "ingrese un numero para subindice " i
		leer num
		vector(i)=num
	Fin Para

	      escribir "ingrese numero a buscar en el vector " 
	leer num2
	c=0
	Para i<-0 Hasta 4  Hacer
		si num2==vector(i) entonces
			escribir "para el numero " num2 " la posicion es " i
			c=1
		
		Finsi
	FinPara
	si c==0 Entonces
		escribir "el numero " num2 " no se encuentra en el vector"
	FinSi
FinAlgoritmo

	
		

//		si  entonces
//			escribir "la posicion es " vector(i)
//		sino 
//			escribir "el numero no esta" 
//		FinSi
		

		
		
	


