Algoritmo G3_ejercicio6
	definir num1,num2,retorno como enteros;
	
	escribir "Ingrese el valor de A";
	leer num1;
	escribir "Ingrese el valor de B";
	leer num2;
	 cambio(num1,num2);
	
FinAlgoritmo

SubAlgoritmo cambio(A,B)
	definir aux como entero;
	escribir "El valor de A es: ",A;
	escribir "El valor de B es: ",B;
	escribir "Intercambiando valores";
	aux = A
	A = B;
	B = aux;
	escribir "";
	escribir "El valor (nuevo) de A es: ",A;
	escribir "El valor (nuevo) de B es: ",B;
	
	
FinSubAlgoritmo
	