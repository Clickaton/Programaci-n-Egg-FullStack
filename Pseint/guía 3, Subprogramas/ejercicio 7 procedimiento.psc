//7. Crear un programa que dibuje una escalera de n�meros, donde cada l�nea de n�meros
//comience en uno y termine en el n�mero de la l�nea. Solicitar la altura de la escalera al usuario
//al comenzar. Ejemplo: si se ingresa el n�mero 3:
//1
//12
//123

Subproceso escalera(num)
	definir i,j Como Entero
	
	para i=1 hasta num //determina posicion de la escalera
		para j=1 hasta i Hacer //determina la posici�n de los n�meros
			escribir sin saltar j "  "
		FinPara
		
		escribir ""
	FinPara
	
FinSubProceso

Algoritmo G3_EjercProcedimiento_ej7
	definir num Como Entero
	Escribir "Ingrese la cantidad de escalones: "
	leer num
	
	escalera(num)
	
	
FinAlgoritmo
