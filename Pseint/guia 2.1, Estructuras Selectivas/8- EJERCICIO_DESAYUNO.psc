Algoritmo EJERCICIO_DESAYUNO
	
	Definir bebida Como Caracter
	Escribir "Desea tomar té o café?"
	Leer bebida
	
	Si bebida="Café" Entonces
		Escribir "Solo o cortado?"
		Leer bebida
		Si bebida= "cortado" Entonces
			Escribir "Prefiere leche vegetal?"
			Leer bebida
		Fin Si
	Fin Si
	
FinAlgoritmo
