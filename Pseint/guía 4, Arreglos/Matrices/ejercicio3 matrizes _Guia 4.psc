//3. Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
//un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro
//subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y
//los resultados por pantalla.
Algoritmo Ejercicio3_Matrices_guia4
	Definir matriz, i, j Como Entero
	Escribir " Ingrese el tamaño de la matriz n*m "
	leer i, j
	Dimension matriz(i,j)
	rellenarmatriz(matriz,i,j)

	
FinAlgoritmo

SubProceso rellenarmatriz(matriz Por referencia,i Por valor,j Por valor) // Ponemos por valor a i a j porque se les va a modificar el valor en este proceso
	para i<-0 hasta i-1 Hacer // Esta es la formula base de las matrices para ingresar valores
		para j <-0 hasta j-1  Hacer
			matriz(i,j) = Aleatorio(0,10)
			
		FinPara
		
	FinPara
	para i<-0 hasta i - 1 Hacer// Y esta es la formula para imprimir los valores
		para j <-0 hasta j - 1 Hacer
			Escribir matriz(i,j), " " sin saltar
		FinPara
		escribir " " // esto se pone para que se realize el salto de linea y quede las columnas y filas deseadas
	FinPara
	sumamatriz( i, j, matriz)
FinSubProceso


SubProceso sumamatriz( i Por Referencia, j Por Referencia, matriz Por Referencia)
	Definir resultado Como Entero
	para i<-0 hasta i - 1 Hacer // Esta es la formula base de las matrices para ingresar valores
		para j <-0 hasta j - 1 Hacer
			
			resultado=matriz(i,j)+matriz(i,j)
			
		fin para
	FinPara
	
	Escribir resultado
FinSubProceso
	