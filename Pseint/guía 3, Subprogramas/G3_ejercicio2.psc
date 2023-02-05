//Realizar una función que valide si un número es impar o no. Si es impar la función debe
//devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe tener
//		mensajes que digan si es par o no, eso debe pasar en el Algoritmo. 

Algoritmo G3_ejercicio2
	definir num1 como entero;
	definir retorno1 como logico; // V / F
	
	escribir "Ingrese un numero ";
	leer num1;
	
	retorno1 = valores(num1);
	
	escribir "El resultado es: ",retorno1;
FinAlgoritmo

Funcion comprobar <- valores(x1)
	definir comprobar como logico;
	
	si (x1 MOD 2)==0 Entonces
		comprobar = falso
	SiNo
		comprobar = verdadero
	FinSi
FinFuncion