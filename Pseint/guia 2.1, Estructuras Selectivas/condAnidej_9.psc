Algoritmo condAnidej_10
	definir ano Como Entero
	escribir "ingrese un año:"
	leer ano
	
	si ano mod 4 = 0 Y ano mod 100 <> 0 Entonces
		escribir "el año es bisiesto"
	FinSi
	
	si ano mod 100 = 0 Y ano mod 400 = 0 Entonces
		escribir "el año es bisiesto"
	SiNo
		escribir "el año no es bisiesto"
	FinSi
	
FinAlgoritmo
