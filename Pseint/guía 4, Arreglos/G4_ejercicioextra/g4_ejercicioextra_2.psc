//2. Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.



Algoritmo sin_titulo
Definir n, vector, subindice, resultado como entero	//Definir una variable sola para el ciclo para, el i est� de mas.
Escribir "Ingrese un n�mero para el tama�o del vector:"
leer n
Dimension vector(n)
resultado=0
para n<-0 hasta n-1
	Escribir "Ingrese los subindices para el vector:"
	leer subindice
	vector(n)=subindice
	resultado=subindice+resultado
FinPara

Escribir "El promedio de todos los subindices es:"
Escribir resultado/n


FinAlgoritmo
