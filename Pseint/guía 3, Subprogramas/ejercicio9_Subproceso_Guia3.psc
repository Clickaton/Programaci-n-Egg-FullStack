//Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales
//repetidas. Al final el procedimiento mostrará la frase final.

Algoritmo ejercicio9
	
	Definir frase Como Caracter
	
	Escribir "dime una frase y le removere las vocales repetidas "
	leer frase
	
	removerVocales(frase)
	
FinAlgoritmo


SubProceso removerVocales(frase)
	Definir j Como Entero
	Definir letra, auxiliar Como Caracter
	Definir a,e,i,ou,u como logico
	
	a = Falso
	e = Falso
	i = Falso
	ou= Falso
	u= Falso
	auxiliar = ""
	frase = Minusculas(frase)
	
	para j = 0 hasta Longitud(frase)
		
		letra = Subcadena(frase, j,j)
		
		
		
		Segun letra
			"a": si a = Verdadero
					letra = ""
				FinSi
			"e": si e = Verdadero
					letra = ""
				FinSi
			"i": si i = Verdadero
					letra = ""
				FinSi
			"o": si ou = Verdadero
					letra = ""
				FinSi
			"u": si u = Verdadero
					letra = ""
				FinSi
		FinSegun
		
		contarVocales(letra,a,e,i,ou,u)
		
		auxiliar = Concatenar(auxiliar, letra)
	FinPara

	Escribir "su frase ", frase, " ahora es: " auxiliar
FinSubProceso











SubProceso contarVocales(letra,a Por Referencia,e Por Referencia,i Por Referencia,ou Por Referencia,u Por Referencia)
	Segun letra Hacer
		"a": a=Verdadero
		"e": e=Verdadero
		"i": i=Verdadero
		"o": ou = Verdadero
		"u": u = Verdadero
	FinSegun
FinSubProceso
