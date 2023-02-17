//Realizar un procedimiento que permita realizar la división entre dos números y muestre el cociente y el resto utilizando el método de restas sucesivas.
//El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta obtener un resultado menor que el divisor,
//este resultado es el residuo, y el número de restas realizadas es el cociente. 
//Por ejemplo: 50 / 13:
//		50 -13 = 37 una resta realizada
//		37 - 13 = 24 dos restas realizadas
//		24 - 13 = 11 tres restas realizadas
//	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

Algoritmo sin_titulo
	
	Definir num1, num2 Como Real
	
	Escribir "Ingrese un numero"
	Leer num1
	Escribir "Ingrese el numero divisor"
	Leer num2
	
	divisor(num1, num2)
	
	
FinAlgoritmo

SubProceso divisor(num1 Por Referencia, num2 Por Valor)
	definir resto, cont1 Como entero
	
	cont1=0
	resto=num1
	
	Repetir
		resto=resto-num2
		
		cont1=cont1+1
		
	Mientras Que resto>num2
	
	Escribir "El cociente es igual a: " cont1
	Escribir "El resto es igual a: " resto
	
	
FinSubProceso
	