Algoritmo ejercicio9_g4
	definir mat,i,j,num,fila,columna como entero;
	dimension mat(5,5);
	
	definir existir como logico;
	existir = falso;
	escribir "Vamos a llenar una matriz de 5 X 5 aleatoria";
	escribir "Ingrese un dato a buscar";
	leer num;
	para i=0 hasta 4 con paso 1 Hacer
		para j=0 hasta 4 con paso 1 Hacer
			mat(i,j) = aleatorio(1,12);
		FinPara
	FinPara
	escribir "Mostrando la matriz";
	
	para i=0 hasta 4 con paso 1 Hacer
		para j=0 hasta 4 con paso 1 Hacer
			escribir sin saltar mat(i,j)," | ";
		 FinPara
		 escribir"";
	FinPara
	
	para i=0 hasta 4 con paso 1 Hacer
		para j=0 hasta 4 con paso 1 Hacer
			si( mat(i,j) == num ) Entonces
				fila = i;
				columna = j;
				existir = verdadero;
			finsi
		FinPara
	FinPara
	
	
	si (existir == verdadero) Entonces
		escribir "Encontramos el numero ",num;
		escribir "Fila -> ",fila;
		escribir "Columna -> ",columna;
	SiNo
		escribir "No encontramos el numero";
	FinSi
	
	
	
	
	
FinAlgoritmo
