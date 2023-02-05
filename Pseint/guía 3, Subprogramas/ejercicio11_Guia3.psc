Algoritmo ejercicio11_Guia3
	
	Definir num, pares, impares Como Entero
	Definir resultado Como caracter
	
	escribir "dime un numero y te dire cuantos digitos tiene pares e impares"
	leer num
	
	contadorDeParidad(num,resultado)
	
	Escribir resultado
	
FinAlgoritmo


SubProceso contadorDeParidad(num Por Valor, resultado Por Referencia)
	
	Definir auxiliar, resto, pares, impares Como Entero
	auxiliar = num
	resto = 0
	pares = 0
	impares = 0
	resultado = ""
	
	Hacer
		resto = auxiliar % 10
		
		 parOimpar(resto, pares, impares)
		
		auxiliar = trunc(auxiliar/10)
	Mientras Que auxiliar <> 0
	
	resultado = EscribirResultado(impares, pares)
	
FinSubProceso


SubProceso parOimpar(resto Por Valor, pares Por Referencia, impares Por Referencia)
	si resto%2 = 0 Entonces
		pares = pares + 1
	sino
		impares = impares + 1
	FinSi
FinSubProceso


Funcion resultado <- EscribirResultado(impares, pares)
	definir resultado Como Caracter
	
	si pares = 0
		resultado ="todos sus digitos son impares"
	SiNo
		si impares = 0
			resultado = "todos sus digitos son pares"
		SiNo
			Escribir "sus numero tiene ", impares, " impares y ", pares," pares"
		FinSi
	FinSi
	

FinFuncion
	