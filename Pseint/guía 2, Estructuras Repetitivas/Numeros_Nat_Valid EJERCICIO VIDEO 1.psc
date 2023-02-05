//sumatoria de los N primeros números enteros mayores que cero
Algoritmo Numeros_Nat_Valid
	definir num, suma, i Como Entero
	
	escribir "ingrese un numero entero"
	leer num
	///Mientras <expresion_logica> Hacer
	/// <secuencia_de_acciones>
	///Fin Mientras
	
	suma = 0
	i=1
	mientras i <= num Hacer
		suma = suma + i
		i = i + 1
	FinMientras
	
	escribir "La suma de los ", num, " números naturales es: ", suma
	
	
FinAlgoritmo
