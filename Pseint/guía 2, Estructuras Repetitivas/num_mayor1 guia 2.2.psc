Algoritmo num_mayor1
	Definir x Como Entero
	
	Definir n,num_mayor Como Real
	
	Escribir "Ingresa un numero"
	
	leer n
	num_mayor=n
	
	para x = 1 Hasta 9 Con Paso 1 Hacer
		
		Escribir "Ingresa un numero"
		
		leer n
		
		si num_mayor < n Entonces
			
			num_mayor = n
			
		FinSi
		
	FinPara
	
Escribir "El numero mayor es: ",num_mayor
FinAlgoritmo
