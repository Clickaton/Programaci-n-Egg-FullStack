Algoritmo condAnidej_10
	definir ano Como Entero
	escribir "ingrese un a�o:"
	leer ano
	
	si ano mod 4 = 0 Y ano mod 100 <> 0 Entonces
		escribir "el a�o es bisiesto"
	FinSi
	
	si ano mod 100 = 0 Y ano mod 400 = 0 Entonces
		escribir "el a�o es bisiesto"
	SiNo
		escribir "el a�o no es bisiesto"
	FinSi
	
FinAlgoritmo
