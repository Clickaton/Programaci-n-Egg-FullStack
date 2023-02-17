//Crear un subproceso que rellene dos arreglos de tama�o n, con n�meros aleatorios. Despu�s,
//hacer una funci�n que reciba los dos arreglos y diga si todos sus valores son iguales o no. 
Algoritmo ejercicio7vector
	definir vectA,vectB, i,n Como Entero
	Escribir "Determina la dimension del vector"
	Leer n
	Dimension vectA(n),vectB(n)
	para i = 0 Hasta n-1 Hacer
		vectA(i)=Aleatorio(1,100)
	FinPara
	para i=0 hasta n-1 Hacer
		escribir "Posicion ",i+1," del Vector A  = ",vectA(i)
	FinPara
	Escribir ""
	para i = 0 Hasta n-1 Hacer
		vectB(i)=Aleatorio(1,100)
	FinPara
	para i=0 hasta n-1 Hacer
		escribir "Posicion ",i+1," del Vector B = ",vectB(i)
	FinPara
	Escribir ""
	escribir validacionNumAlt(n,vectA, vectB)
FinAlgoritmo

//La funci�n debe devolver el resultado de est� validaci�n, para mostrar el mensaje en el algoritmo.
//Nota: recordar el uso de las variables de tipo l�gico.
Funcion estado = validacionNumAlt(n,vectA, vectB)
	definir estado Como Logico
	definir i,c Como Entero
	estado = Falso
	c = 0
	para i = 0 Hasta n-1 Hacer
		si vectA(i)==vectB(i) Entonces
			c = c + 1
		FinSi
	FinPara
	si c == n Entonces
		estado = Verdadero
	SiNo
		estado = Falso
	FinSi
FinFuncion
	