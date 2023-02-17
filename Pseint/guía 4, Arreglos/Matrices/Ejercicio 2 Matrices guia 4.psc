//2. Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
//usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las
//coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En
//caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.
Algoritmo sin_titulo
	Definir matriz, i, j, num, fila, columna Como Entero
	definir EncNum como logica
	fila = 0
	columna = 0
	EncNum = falso
	
	Dimension matriz( 5, 5 ) 
	para i<-0 hasta 4 Hacer // Esta es la formula base de las matrices para ingresar valores
		para j <-0 hasta 4 Hacer
			matriz(i,j) = Aleatorio(0,10)
			
		FinPara
	FinPara
	Escribir " ingrese un numero para encontrar en la matriz "
	leer num
	para i<-0 hasta 4 Hacer// Y esta es la formula para imprimir los valores
		para j <-0 hasta 4 Hacer
			Escribir matriz(i,j), " " sin saltar
		FinPara
		escribir " " // esto se pone para que se realize el salto de linea y quede las columnas y filas deseadas
	FinPara
	para i<-0 hasta 4 Hacer // Esta es la formula base de las matrices para ingresar valores
		para j <-0 hasta 4 Hacer
			Si matriz(i,j) = num Entonces
				fila = i
				columna = j
				EncNum = Verdadero
				Escribir " su numero esta en la fila: " i + 1, " columna: " j + 1 // le sumamos uno para que nos de el valor real de donde se encuentra 
				
			FinSi
			
		FinPara
	FinPara
	Escribir " "
	si EncNum = falso // lo ponemos por fuera porque es la condicion que mas se repite y necesitamos que se imprima una sola vez
		Escribir " no se encontro el numero "
	FinSi
	
	
FinAlgoritmo
