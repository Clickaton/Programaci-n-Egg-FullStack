Algoritmo conDMultEj6
	definir dia, mes, ano Como Entero
	definir mesl Como Caracter
	escribir "Ingrese un d�a con valor num�rico:"
	leer dia
	escribir "ingrese un mes con valor num�rico:"
	leer mes
	escribir "ingrese un a�o con valor num�rico:"
	leer ano
	
	Si dia>31 Entonces 
		escribir "el d�a es inv�lido"
	Fin Si
	si mes>12 Entonces
		escribir "el mes es inv�lido"
	FinSi
	Si mes=2 Y dia>28 Entonces
		escribir "Fecha inv�lida"
	FinSi
	si ano<0 Entonces
		escribir "el a�o es inv�lido"
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
	
	Escribir "El dia " dia, " del mes de " , mesl, " del a�o " ano
	
FinAlgoritmo
