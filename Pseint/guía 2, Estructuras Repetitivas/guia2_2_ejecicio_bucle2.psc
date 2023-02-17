Algoritmo guia2_2_ejecicio_bucle2
	//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
	//solicite números al usuario hasta que la suma de los números introducidos supere el
	//límite inicial.
	
	Definir valorLimite,num, suma Como Entero
	
	Escribir " ingrese un valor limite "
	Leer valorLimite
	Escribir ""
	
	Escribir " ingrese numeros para sumar "
	Leer num
	Escribir ""
	suma<-num
	
	Mientras  suma <=valorLimite Hacer
		Escribir " ingrese otro numero para sumar "
		Leer num
		suma= suma + num
		
		
	FinMientras
	Escribir " la suma de los numeros introducidos " suma " supero el limite " valorLimite
FinAlgoritmo
