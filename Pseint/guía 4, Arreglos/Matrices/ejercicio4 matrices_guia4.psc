//Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
//	principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro
//	subproceso para imprimir la matriz.


Algoritmo ejercicio4_matrices_guia4
	definir matriz, fila, columna Como Entero
	Dimension matriz(3,3)
	fila=0
	columna=0
	
	matriz1(matriz,fila,columna)

FinAlgoritmo


SubProceso matriz1(matriz,fila,columna) // Ponemos por valor a i a j porque se les va a modificar el valor en este proceso
	
	para fila<-0 hasta 2 Hacer // Esta es la formula base de las matrices para ingresar valores
		para columna<-0 hasta 2  Hacer
			si fila=0 y columna=0 Entonces
				matriz(0,0)=0
				
			FinSi
			si fila=1 y columna=1 Entonces
				matriz(1,1)=0
			FinSi
			si fila=2 y columna=2 Entonces
				matriz(2,2)=0
			SiNo
				
				matriz(0,1) = Aleatorio(0,10)
				matriz(0,2) =Aleatorio(0,10)
				matriz(1,0) = Aleatorio(0,10)
				matriz(1,2) =Aleatorio(0,10)
				matriz(2,0) = Aleatorio(0,10)
				matriz(2,1) =Aleatorio(0,10)
			FinSi
			
		FinPara
		
	FinPara
	
	para fila<-0 hasta 2 con paso 1 Hacer// Y esta es la formula para imprimir los valores
		para columna <-0 hasta 2 Hacer
			Escribir matriz(fila,columna), " | " sin saltar
		FinPara
		escribir " " // esto se pone para que se realize el salto de linea y quede las columnas y filas deseadas
	FinPara
	
	
FinSubProceso