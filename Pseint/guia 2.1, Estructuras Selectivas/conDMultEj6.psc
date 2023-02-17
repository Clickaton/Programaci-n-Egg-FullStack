Algoritmo conDMultEj6
	definir dia, mes, ano Como Entero
	definir mesl Como Caracter
	escribir "Ingrese un día con valor numérico:"
	leer dia
	escribir "ingrese un mes con valor numérico:"
	leer mes
	escribir "ingrese un año con valor numérico:"
	leer ano
	
	Si dia>31 Entonces 
		escribir "el día es inválido"
	Fin Si
	si mes>12 Entonces
		escribir "el mes es inválido"
	FinSi
	Si mes=2 Y dia>28 Entonces
		escribir "Fecha inválida"
	FinSi
	si ano<0 Entonces
		escribir "el año es inválido"
	FinSi
	si mes= 1 Entonces
		mesl= "enero"
	FinSi
	
	si mes=2  Entonces
		mesl= "febrero"
	FinSi
	si mes = 3 Entonces
		mesl = " marzo "
	FinSi
	si mes = 4 Entonces
		mesl = " abril "
	FinSi
	
	Escribir "El dia " dia, " del mes de " , mesl, " del año " ano
	
FinAlgoritmo
