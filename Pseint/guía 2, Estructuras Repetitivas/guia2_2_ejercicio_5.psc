//Escribir un programa que lea n�meros enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el m�ximo n�mero ingresado, el m�nimo, y el promedio de
//todos ellos.
//Para poder lograr, por ejemplo, el m�ximo inicializaremos una variable en cero llamada
//	numeroMaximo. Luego iremos comparando cada n�mero que se ingresa con esta variable. Si es
//		mayor reemplazaremos el valor de numeroMaximo. Por ejemplo si 5>0 entonces el m�ximo entre
//			estos n�meros ser� 5. Si luego ingreso el n�mero 2, se eval�a 2>5 lo que resultar� falso y por lo
//				tanto el valor 5 de numeroMaximo no se reemplaza. Una l�gica similar tendr� el n�mero menor.

Algoritmo guia2_2_ejercicio_5
	definir Num,NumeroMaximo, NumeroMinimo ,num2,i, suma Como entero
	definir Promedio Como Real
	
	i=0	
	Escribir "Ingrese un n�mero"
	leer num2
	suma=num2
	Hacer
		Escribir "Ingrese diferentes n�meros:"
		leer Num
		si num>num2 Entonces
			NumeroMaximo=num
		SiNo
			NumeroMinimo=num
		FinSi
		i=i+1
		suma=suma+num2
	Mientras Que num<>0 
	promedio=suma/(i-1)
	
	Escribir "El numero m�ximo es: " NumeroMaximo
	Escribir "El n�mero m�nimo es: " NumeroMinimo
	Escribir "El promedio de los n�meros es: " promedio
	
	
	
	
	
	
	
FinAlgoritmo
