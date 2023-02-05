//3. Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
//almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector se
//debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la función
//	Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su longitud.

Algoritmo G4_ejercicioextra_3
	definir vector1, nombre Como Caracter
	definir vector2, n Como Entero
	Escribir "Ingrese el tamaño de ambos vectores:"
	leer n
	Dimension vector1(n), vector2(n)
	
	para n<-0 hasta n-1 Hacer
		Escribir "Ingrese un nombre como subindice del vector"
		leer nombre
		vector1(n)=nombre
		vector2(n)=Longitud(nombre)
	FinPara
	
	Escribir "El nombre y la cantidad de letras es:"
	para n<-0 hasta n-1 Hacer
		escribir vector1(n) " = " vector2(n)
		
	FinPara
	
FinAlgoritmo
