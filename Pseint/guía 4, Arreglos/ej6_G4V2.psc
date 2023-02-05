//Disponemos de un vector unidimensional de 20 elementos de tipo carácter. Se pide 
//desarrollar un programa que:
//	a) Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por letra. 
//Ayuda: utilizar la función Subcadena de PSeInt.
//	b) Una vez completado lo anterior, pedirle al usuario un carácter cualquiera y una 
//	posición dentro del arreglo, y el programa debe intentar ingresar el carácter en la 
//	posición indicada, si es que hay lugar (es decir la posición está vacía o es un espacio 
//	en blanco). De ser posible debe mostrar el vector con la frase y el carácter ingresado, 
//	de lo contrario debe darle un mensaje al usuario de que esa posición estaba ocupada.

Algoritmo ej6_G4
	definir  i, frase2, c, posicion Como entero
	definir   vector, frase, carac  como caracter 
	Dimension vector(20)
	escribir "ingresa una frase de maximo 20 caracteres "
	leer frase 
	c=0
	frase2=longitud(frase)
	
	Mientras frase2-1>20 Hacer
		escribir "ingresa una frase de maximo 20 caracteres "
		leer frase 
	FinMientras
	
	para i<-0 hasta frase2  Hacer
		vector(i)=Subcadena(frase,i,i)
		
	FinPara
	para i<-0 hasta frase2 Hacer
		escribir Sin Saltar " " vector(i)
		
	FinPara
	
	escribir "ingrese el caracter y la posicion en el vector"
	leer carac, posicion
	
	si vector(posicion)="" o vector(posicion)=" "
		vector(posicion)=carac
		para i<-0 Hasta frase2 Hacer
			Escribir Sin Saltar "" vector(i)
		FinPara
		
	SiNo
		Escribir "Posición ocupada, elija otra"
	FinSi
	
	
	
//	para i<-0 hasta frase2 Hacer
//		si carac==vector(" ") Entonces
//			escribir "para el caracter " carac "la posicion en el vector es " vector(i)
//			c=1
//			
//		FinSi
//	FinPara
//		
		
		
	
	
	
FinAlgoritmo
