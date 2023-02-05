//1. Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los
//muestre por pantalla.
Algoritmo arreglosVectores_Ej1
	Definir vector, i Como Entero
	Dimension vector(5)
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		vector(i)=i
		leer vector(i)
		
	Fin Para
	
	Escribir vector(0), " " vector(1), " " vector(2), " " vector(3), " " vector(4)
	
FinAlgoritmo
