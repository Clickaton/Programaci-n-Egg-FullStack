Algoritmo sin_titulo
//	Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter, facilitando
//	un potencial reordenamiento del vector. Digamos que se pide ingresar el carácter en la
//	posición X y la misma está ocupada, entonces de existir un espacio en cualquier posición X-n
//	o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el carácter
//		en cuestión en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio
	//		más cercano.
	
	Definir vector, vectorN, int, entrada Como Caracter
	Definir i, pos, d, b Como Entero
	definir desplaza Como Logico
	Dimension vector(20), vectorN(20)
	
	d=0
	b=0
	desplaza = Verdadero
	
	Escribir "Ingrese la frase a guardar"
	Leer int
	Para i=0 Hasta 19 Hacer
		vector(i)=Subcadena(int,i,i)	
		vectorN(i)=Subcadena(int,i,i)		
	FinPara
	
	Escribir "Ingrese el caracter que desea ingresar"
	Leer entrada
	Escribir "Ingrese la posición en la que lo desea almacenar"
	Leer pos
	
	si vector(pos)="" Entonces
		vector(pos)=entrada
	SiNo
		Para i<-pos hasta 19-pos con paso 1
			si vector(i)="" 
				b=b+1
			FinSi
			
		FinPara
		
		Para i<-pos hasta 0 con paso -1
			si vector(i)=" "
				d=d+1
			finsi			
		FinPara
		
		si b>d Entonces
			Para i<-pos-1 hasta 0 con paso -1 hacer
				si vectorN(i) = "" entonces
					vectorN(i-1)=vector(i)
					
				FinSi
			FinPara
			vectorN(pos)=entrada
		SiNo
			Para i<-pos hasta 19-pos con paso 1 hacer
				si vectorN(i)<>"" entonces
					vectorN(i)=Subcadena(int,i+1,i+1)
				FinSi
			FinPara
			vectorN(pos)=entrada
		FinSi
		
		
	FinSi
	Para i=0 Hasta 19 Hacer
		
		Escribir vectorN(i) Sin Saltar
	FinPara
	
FinAlgoritmo