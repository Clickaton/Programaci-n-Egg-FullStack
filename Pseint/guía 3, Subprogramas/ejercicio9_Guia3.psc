
//frase = es el valor que nos da el usuario
//  resultado = es donde vamos a guardar el resultado
SubProceso codificar(frase Por Valor, resultado Por Referencia)
	// se define e inicializa variable de apoyo
	Definir i Como Entero
	Definir letra Como Caracter
	
	/// importante!! 
	// resultado se tiene que inicializar vacio 
	
	resultado = ""

	// bucle PARA que busca y codifica las vocales
	
	Para i=0 Hasta Longitud(frase) Hacer
		
		letra = Subcadena(frase, i, i)  
		// condicional que codica las vocales
		Segun letra Hacer
			"a": letra = "@" 
			"e": letra = "#"
			"i": letra = "$"
			"o": letra = "%"
			"u": letra = "*"
		FinSegun
		
		// cocatenacion de letra por letra en la variable resultado(ya inicializada)
		resultado=concatenar(resultado, letra)
	FinPara
	

FinSubProceso

Algoritmo ejercicio9_Guia3
	
	///importante!!
	//definir todos las variables que vamos a usar en el Algoritmo principal 
	//por mas que ya se hayan definido en la funcion.
	
	Definir frase, resultado Como Caracter
	
	Escribir "dime una palabra, y la codificare"
	Leer frase
	
	codificar(frase, resultado)
	
	Escribir resultado
	
	
FinAlgoritmo
