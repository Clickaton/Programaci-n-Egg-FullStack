Algoritmo G3_ejercicio7
	definir cant como entero;
	
	escribir "Ingrese la cantidad de dias a calcular";
	leer cant;
	clima(cant);
	
FinAlgoritmo


subproceso clima(x1)
	
	definir min,max,prom,i como real;
	
	para i=1 hasta x1 con paso 1 Hacer
		escribir "Ingrese la minima T° del dia ",i;
		leer min;
		escribir "Igrese la maxima T° del dia ",i;
		leer max;
		prom = (max + min) /2;
		escribir "El promedio del dia ",i," es: ",prom," C°";
		escribir "";
	FinPara
	
FinSubProceso
	