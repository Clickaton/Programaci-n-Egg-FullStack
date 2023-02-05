Algoritmo G3_ejercicio1
	definir n1,n2,retorno1 como enteros
	
	escribir "Ingrese un N° cualquiera";
	leer n1;
	escribir "Ingrese otro N°";
	leer n2;
	
	retorno1 = dosnumeros(n1,n2);
	
	//escribir "El resultado es: ",dosnumeros(n1,n2);
	escribir "";
	
FinAlgoritmo

funcion sumar <- dosnumeros(x1,x2)
	definir sumar como entero;
	
	sumar = x1 + x2;
	
	escribir "El resultado es: ",sumar;
FinFuncion
	