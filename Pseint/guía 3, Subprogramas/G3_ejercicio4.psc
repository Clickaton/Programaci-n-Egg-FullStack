Algoritmo G3_ejercicio4
	definir frase como cadena;
	definir letra como caracter;
	definir retorno1 como entero;
	
	escribir "Ingrese un frase";
	leer frase;
	escribir "";
	escribir "Ahora ingrese una letra a buscar";
	leer letra;
	retorno1 = letras(frase,letra);
	
	escribir "La letra ",letra," se encontro ",retorno1," veces";
FinAlgoritmo

Funcion comprobar <- letras(x1,x2)
	definir comprobar,i como entero;
	definir letter Como Caracter
	
	comprobar = 0;
	
	para i=0 hasta longitud(x1)-1 con paso 1 Hacer
		letter = subcadena(x1,i,i);
		
		si x2 == letter Entonces
			comprobar = comprobar +1;;
		FinSi
	FinPara
FinFuncion	