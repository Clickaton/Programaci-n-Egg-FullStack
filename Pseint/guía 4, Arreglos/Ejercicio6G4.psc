Algoritmo ejercicio6_Guia4
	
	Dimension vector(20) 
	
	Definir vector, frase, letra Como Caracter
	Definir posicion Como Entero
	Escribir "dime una frase de menos de 20 letras"
	leer frase
	
	enumerarFrase(vector,frase)
	
	Escribir "dime que letra deseas introducir y su posicion "
	leer letra, posicion
	
	ponerLetra(vector, letra, posicion)
	
FinAlgoritmo



SubProceso enumerarFrase(v,f)
	Definir i Como Entero
	para i = 0 hasta 19
		v(i)= subcadena(f,i,i)
	FinPara
	FinSubProceso
	
	SubProceso ponerLetra(vector,letra, posicion) 
		Definir i Como Entero
		si vector(posicion) = "" o vector(posicion)=" " Entonces
			vector(posicion) = letra
			Para i = 0 Hasta 19 Hacer
				Escribir Sin Saltar vector(i)
				
			FinPara

		SiNo
			Escribir "posicion ocupado"
		FinSi
		Escribir ""
		
		
		FinSubProceso
		