Algoritmo G3_ejercicio3
	definir num1,num2 como entero;
	definir retorno1 como logico;
	escribir "Ingrese el primer numero";
	leer num1;
	escribir "Ingrese el segundo numero";
	leer num2;
	retorno1 = valores(num1,num2);
	
	escribir "El resultado es: ",retorno1;
FinAlgoritmo

Funcion esmultiplo <- valores(x1,x2)
	definir esmultiplo como logico;
	
	si(x1 MOD x2)==0 Entonces
		esmultiplo = verdadero;
	SiNo
		esmultiplo = falso;
	FinSi
FinFuncion
