//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a buscar
//tambi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n donde se
//encuentra el valor. En caso que el n�mero se encuentre repetido dentro del arreglo se deben
//imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso que el n�mero a buscar no est� adentro del arreglo se debe mostrar un
//mensaje.
Algoritmo guia4ejercicio3
	Definir vector, n, i Como Real
	Escribir "Elije la cantidad elementos"
	Leer n
	Dimension vector(n)
	Escribir "Ingrese los elementos del vector"
	
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		leer vector(i)
	Fin Para
	vectores(vector, n)
FinAlgoritmo

SubProceso vectores(vector por referencia, n por referencia)
	Definir m, i Como real
	Escribir "Elije el elemento a buscar"
	Leer m 
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Si vector(i)=m Entonces
			Escribir "El numero se encuentra en ", i+1
			
		Fin Si
		
	Fin Para
	Si vector(i)<>m  Entonces
		Escribir "El numero ingresado no se encuentra"
	Fin Si
	
FinSubProceso
	