//Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserci�n del car�cter, facilitando
//un potencial reordenamiento del vector. Digamos que se pide ingresar el car�cter en la
//posici�n X y la misma est� ocupada, entonces de existir un espacio en cualquier posici�n X-n
//o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el car�cter
//	en cuesti�n en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio
//	m�s cercano.
//Por ejemplo, suponiendo la siguiente frase y los sub�ndices del vector:

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
		Escribir "La posici�n est� ocupada"
		vector(posicion)=carac+vector(posicion)
		para i<-0 Hasta frase2 Hacer
			Escribir Sin Saltar "" vector(i)
			
		FinPara
		Escribir ""
	FinSi
	
	
	
	
	
	
FinAlgoritmo



