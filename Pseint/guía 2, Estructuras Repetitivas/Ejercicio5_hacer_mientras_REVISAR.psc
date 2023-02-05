//Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
//todos ellos.
//Para poder lograr, por ejemplo, el máximo inicializaremos una variable en cero llamada
//	numeroMaximo. Luego iremos comparando cada número que se ingresa con esta variable. Si es
//		mayor reemplazaremos el valor de numeroMaximo. Por ejemplo si 5>0 entonces el máximo entre
//			estos números será 5. Si luego ingreso el número 2, se evalúa 2>5 lo que resultará falso y por lo
//				tanto el valor 5 de numeroMaximo no se reemplaza. Una lógica similar tendrá el número menor.
Algoritmo Ejercicio5_hacer_mientras_REVISAR
	definir N_entero, numeroMaximo, numeroMinimo Como Entero
	definir promedio Como Real
	numeroMaximo=0
	numeroMinimo=0
	
	hacer 
		Escribir "Ingrese un número entero distinto a 0"
		leer N_entero
		si N_entero>numeroMaximo Y N_entero>=0 Entonces
			numeroMaximo=numeroMaximo+N_entero
		FinSi
		si N_entero>numeroMinimo Y N_entero<numeroMaximo Y N_entero<=0
			numeroMinimo=numeroMinimo+N_entero
		FinSi
	Mientras Que N_entero<>0
	
	Escribir "El número Máximo es: " numeroMaximo 
	Escribir "El número Mínimo es: " numeroMinimo
	Escribir "El promedio es de: "
	
	
FinAlgoritmo
	