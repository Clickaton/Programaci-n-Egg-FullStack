//1. Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios y los
//muestre por pantalla.

Algoritmo G4_ejercicioextra_1
	definir vector1, vector2, i Como Entero
	Dimension vector1(5), vector2(5)
	
	para i<-0 hasta 4 Hacer
		vector1(i)=Aleatorio(0,100) 
		vector2(i)=Aleatorio(0,100) 
	FinPara
	Escribir "El primer vector es: "
	para i<-0 hasta 4 Hacer
		
		Escribir vector1(i) ", " Sin Saltar
	FinPara
	Escribir ""
	Escribir "El segundo vector es: "
	para i<-0 hasta 4 Hacer
		escribir vector2(i), ", " Sin Saltar
	FinPara
	
	
FinAlgoritmo
