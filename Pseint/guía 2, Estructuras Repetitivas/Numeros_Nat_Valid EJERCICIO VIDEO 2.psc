//sumatoria de los N primeros n�meros enteros mayores que cero
Algoritmo Numeros_Nat_Valid
	definir num, suma, i Como Entero
	
///hacer 
/// <secuencia_de_acciones>
	///Mientras Que <expresion_logica>
	
	hacer 
		escribir "Ingrese un n�mero entero positivo"
		leer num
	Mientras Que num <= 0
	
	suma = 0
	i=1
	mientras i <= num Hacer
		suma = suma + i
		i = i + 1
	FinMientras
	
	escribir "La suma de los ", num, " n�meros naturales es: ", suma
	
	
FinAlgoritmo
