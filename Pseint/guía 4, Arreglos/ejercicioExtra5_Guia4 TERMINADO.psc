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
	
	Definir i,c,c2 Como Entero
	Definir auxiliar Como Caracter
	Dimension auxiliar(20)
	c = 0
	c2 = 0
	//guarda los caracteres de la frase en un vector auxiliar para salvaguardar los valores
	Para i =0 Hasta 19
		auxiliar(i)=vector(i)
	FinPara
	////   hola%mundo
	////   vector = frase(5)      
	si vector(posicion) = "" o vector(posicion)=" " Entonces
		vector(posicion) = letra /// %
	SiNo
		//los dos ciclos para recorren de la posicion a cambiar al lado izq y derecho, para determinar el espacio mas cerca y asi reordenar la frase
		para i = posicion hasta 0 Con Paso -1 Hacer//Lado izquierdo
			si vector(i) == "" o vector(i) == " " Entonces
				i = 0
			FinSi
			c = c + 1
		FinPara
		para i = posicion hasta 19 Hacer//Lado derecho
			si vector(i) == "" o vector(i) == " " Entonces
				i = 19
				
			FinSi
			c2 = c2 + 1
		FinPara
		//dependiendo al espacio mas cercano entre las posiciones del vector, corre los valores en las posiciones del vector segun el Caso 
		//lado derecho o izquierdo
		si c > c2 Entonces //ordena lado izquierdo
			Para i = posicion Hasta 18
				vector(i+1) = auxiliar(i)
			FinPara
			vector(posicion) = letra
		SiNo//ordena lado derecho
			si c2 > c Entonces
			Para i = posicion Hasta 1
				vector(i-1) = auxiliar(i)
			FinPara
			vector(posicion) = letra
			FinSi
		fin si
	FinSi
	Para i = 0 Hasta 19 Hacer
		Escribir Sin Saltar vector(i),"|  "
	FinPara
	Escribir ""
	
	
FinSubProceso
