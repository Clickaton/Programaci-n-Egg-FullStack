//4. Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre 0 y
//20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de PseInt.
//Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos estudiantes son:
//	a) Deficientes 0-5
//	b) Regulares 6-10
//	c) Buenos 11-15
//	d) Excelentes 16-20

Algoritmo G4_ejercicioextra_4
	Definir vector, i, D, R, B, E Como Entero
	Dimension vector(100)
	D=0
	R=0
	B=0
	E=0
	
	
	para i<-0 hasta 99
		vector(i)=Aleatorio(0,20)
		si vector(i)<=5 Entonces
			D=D+1
		FinSi
		si vector(i)>=6 y vector(i)<=10
			R=R+1
		FinSi
		si vector(i)>=11 y vector(i)<=15
			B=B+1
		FinSi
		si vector(i)>=16 y vector(i)<=20
			E=E+1
		FinSi
	FinPara
	
	Escribir "Los alumnos con nota deficiente son: ", D
	Escribir "Los alumnos con nota Regular son: ", R
	Escribir "Los alumnos con nota Buena son: ", B
	Escribir "Los Alumnos con nota Excelente son: ", E
	
FinAlgoritmo
