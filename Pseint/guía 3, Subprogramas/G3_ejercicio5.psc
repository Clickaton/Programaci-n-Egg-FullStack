Algoritmo G3_ejercicio5
	definir num,primo como entero;
	
	escribir "Ingrese un numero para saber si es primo";
	leer num;
	
	primo = verificarprimo(num);
FinAlgoritmo


Funcion resultado <- verificarprimo(x1)
	
	definir resultado,cont,i como entero;
	cont = 0;
	
	para i=1 hasta x1 con paso 1 Hacer
		
		si (x1 mod i)==0 Entonces
			cont = cont +1;
		FinSi
		
	FinPara
	
	si (cont ==2) Entonces
		escribir x1 " es un N° primo";
	SiNo
		escribir x1 " no es un N° primo";
	FinSi
FinFuncion
	