Algoritmo G3_ejercicio9
	Definir fraseinicio,punto Como Caracter
	Definir cantidad Como Entero
	escribir "Escribir frase"
	leer fraseinicio
	
	frase(fraseinicio)
FinAlgoritmo




SubProceso frase(fraseinicio)
	Definir cont Como Entero
	Definir signos,  largofrase,final Como Caracter
	final=""
	Para cont=0 Hasta Longitud(fraseinicio)-1 Con Paso 1 Hacer
		largofrase=Subcadena(fraseinicio,cont,cont)		
		Segun largofrase hacer
			"a":
				signos="@"
			"e":
				signos="#"
			"i":
				signos="$"
			"o":
				signos="%"
			"u":
				signos="*"
			De Otro Modo:
				signos=largofrase
		FinSegun
		final=Concatenar(final,signos)
	FinPara
	Escribir final
FinSubProceso
