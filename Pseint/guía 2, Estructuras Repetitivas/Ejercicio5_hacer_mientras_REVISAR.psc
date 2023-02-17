//Escribir un programa que lea n�meros enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el m�ximo n�mero ingresado, el m�nimo, y el promedio de
//todos ellos.
//Para poder lograr, por ejemplo, el m�ximo inicializaremos una variable en cero llamada
//	numeroMaximo. Luego iremos comparando cada n�mero que se ingresa con esta variable. Si es
//		mayor reemplazaremos el valor de numeroMaximo. Por ejemplo si 5>0 entonces el m�ximo entre
//			estos n�meros ser� 5. Si luego ingreso el n�mero 2, se eval�a 2>5 lo que resultar� falso y por lo
//				tanto el valor 5 de numeroMaximo no se reemplaza. Una l�gica similar tendr� el n�mero menor.
Algoritmo Ejercicio5_hacer_mientras_REVISAR
	definir N_entero, numeroMaximo, numeroMinimo Como Entero
	definir promedio Como Real
	numeroMaximo=0
	numeroMinimo=0
	
	hacer 
		Escribir "Ingrese un n�mero entero distinto a 0"
		leer N_entero
		si N_entero>numeroMaximo Y N_entero>=0 Entonces
			numeroMaximo=numeroMaximo+N_entero
		FinSi
		si N_entero>numeroMinimo Y N_entero<numeroMaximo Y N_entero<=0
			numeroMinimo=numeroMinimo+N_entero
		FinSi
	Mientras Que N_entero<>0
	
	Escribir "El n�mero M�ximo es: " numeroMaximo 
	Escribir "El n�mero M�nimo es: " numeroMinimo
	Escribir "El promedio es de: "
	
	
FinAlgoritmo
	