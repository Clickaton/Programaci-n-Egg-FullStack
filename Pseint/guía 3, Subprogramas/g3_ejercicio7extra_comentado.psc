//Realizar una funci�n que permita obtener el t�rmino n de la sucesi�n de Fibonacci. 
//La sucesi�n de Fibonacci es la sucesi�n de los siguientes n�meros:
//1, 1, 2, 3, 5, 8, 13, 21, 34, ...
//Donde cada uno de los n�meros se calcula sumando los dos anteriores a �l. Por ejemplo:
//La sucesi�n del n�mero 2 se calcula sumando (1+1)
//An�logamente, la sucesi�n del n�mero 3 es (1+2),
//Y la del 5 es (2+3),
//Y as� sucesivamente?
//La sucesi�n de Fibonacci se puede formalizar de acuerdo a la siguiente f�rmula:
//Fibonacci (n) = Fibonacci (n-1) + Fibonacci (n-2) para todo n > 1
//Fibonacci (n) = 1 para todo n <= 1
//Por lo tanto, si queremos calcular el t�rmino "n" debemos escribir una funci�n que reciba 
//como argumento el valor de "n" y que calcule la serie hasta llegar a ese valor.

Algoritmo ejercicio7extra
	definir fibonacii Como Entero
	escribir "Termino fibonacii"
	leer fibonacii
	escribir sucesion(fibonacii)
	
FinAlgoritmo

Funcion numant = sucesion(fibonacii)
	definir fib,i,num,numant Como Entero
	fib=0
	numant = 0
	num = 1
	para i=1 Hasta fibonacii Hacer
		Escribir Sin Saltar numant "," //mando a escribir esta variable para que me muestre la secuencia indicada, se imprime en pantalla el numero anterior a la suma de la variable fib
		fib = numant + num // se suma el numero anterior + el numero actual ejemplo 0+1,1+2+ 2+3
		
		numant = num //a la variable numant se le asigna el valor actual, cuando realiza una siguiente vueta ejemplo i = 2 segunda vuelta, el valor de num se le asigna 
		//a la variable convirtiendo ese valor en el numero anterior
		
		num = fib //se le asigna a la variable num lo que tiene la suma del numero anterior y el actual,colocandolo al realizar la siguiente vuelta del ciclo
		//como el numero actual a sumar con el numero anterior ejemplo num = 1, num = 2. cuando pase a realizar la variable fib su operacion suma seria expresado
		//de esta forma fib = 0 + 1 (num), 1+ 2(num)
		
	FinPara
	
FinFuncion
	