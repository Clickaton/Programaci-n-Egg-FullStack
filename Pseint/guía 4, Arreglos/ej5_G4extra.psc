//Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter, facilitando
//un potencial reordenamiento del vector. Digamos que se pide ingresar el carácter en la
//posición X y la misma está ocupada, entonces de existir un espacio en cualquier posición X-n
//o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el carácter
//	en cuestión en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio
//	más cercano.
//Por ejemplo, suponiendo la siguiente frase y los subíndices del vector:

Algoritmo ej6_G4
	definir  i, frase2, c, posicion Como entero
	definir   vector, frase, carac  como caracter 
	Dimension vector(20)
	escribir "ingresa una frase de maximo 20 caracteres "
	leer frase 
	c=0
	frase2=longitud(frase)
	
	Mientras frase2>20 Hacer
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
	
	si vector(posicion)=" " o vector(posicion)=" "
		vector(posicion)=carac
		para i<-0 Hasta frase2 Hacer
			Escribir Sin Saltar "" vector(i)
		FinPara
	SiNo
		Escribir "La posición está ocupada"
		vector(posicion)=carac+vector(posicion)
		para i<-0 Hasta frase2 Hacer
			Escribir Sin Saltar "" vector(i)
			
		FinPara
		Escribir ""
	FinSi
	
	
	
	
	
	
FinAlgoritmo



