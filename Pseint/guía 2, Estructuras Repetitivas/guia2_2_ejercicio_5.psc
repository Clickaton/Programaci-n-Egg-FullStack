//Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
//todos ellos.
//Para poder lograr, por ejemplo, el máximo inicializaremos una variable en cero llamada
//	numeroMaximo. Luego iremos comparando cada número que se ingresa con esta variable. Si es
//		mayor reemplazaremos el valor de numeroMaximo. Por ejemplo si 5>0 entonces el máximo entre
//			estos números será 5. Si luego ingreso el número 2, se evalúa 2>5 lo que resultará falso y por lo
//				tanto el valor 5 de numeroMaximo no se reemplaza. Una lógica similar tendrá el número menor.

Algoritmo guia2_2_ejercicio_5
	definir Num,NumeroMaximo, NumeroMinimo ,num2,i, suma Como entero
	definir Promedio Como Real
	
	i=0	
	Escribir "Ingrese un número"
	leer num2
	suma=num2
	Hacer
		Escribir "Ingrese diferentes números:"
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
	
	Escribir "El numero máximo es: " NumeroMaximo
	Escribir "El número mínimo es: " NumeroMinimo
	Escribir "El promedio de los números es: " promedio
	
	
	
	
	
	
	
FinAlgoritmo
