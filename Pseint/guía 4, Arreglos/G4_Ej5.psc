//5. Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario. A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el valor
//m�s grande del vector.


Algoritmo G4_Ej5
	Definir n, vector, i, numMax Como Real
	Escribir "Ingrese el tama�o del vector:"
	leer n
	Dimension vector(n)
	
	numMax=numMayor(n,vector)
	escribir "El valor mas grande del vector es: " numMax
FinAlgoritmo

funcion respuestaMayor = numMayor(n,vector) //Funci�n siempre devuelve por valor.
	definir i, respuestaMayor  Como Entero
	respuestaMayor=0
	para i<-0 hasta n-1 Hacer
		Escribir "Ingrese el valor del argumento " i+1
		leer vector(i)
		si vector(i) > respuestaMayor Entonces
			respuestaMayor=vector(i)
		FinSi
		
	FinPara
	
FinFuncion
	