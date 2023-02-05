//Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
//espacio entre cada letra. La frase se mostrará así: H o l a. Nota: recordar el
//		funcionamiento de la función Subcadena().
//	NOTA:. En PseInt, si queremos escribir sin que haya saltos de línea, al final de la
//		operación "escribir" escribimos "sin saltar". Por ejemplo:
//			Escribir sin saltar "Hola, "
//			Escribir sin saltar "cómo estás?"
//		Imprimirá por pantalla: Hola, cómo estás?

Algoritmo buclePara_ejerc7
	///Defino Variables///
	definir frase, j Como Caracter
	definir i Como Entero
	
	///Ingreso de datos///
	Escribir "Ingrese una frase:"
	leer frase
	
	///Comienzo del bucle para///
	para i<-0 Hasta Longitud(frase)  Hacer 
		//se usa la variable "i" para asignarle el valor 0 y la longitud de la frase
		//Eso se hace para darle una finidad al bucle en donde irá de uno en uno hasta 
		//llegar a la última letra de la frase por el operador (LONGITUD)
		escribir Sin Saltar Subcadena(frase,i,i) " " 
		//Se le "Sin saltar" para que se escriba en una sola línea y se le
		//agrega el espacio " "  para que las letras no queden pegadas entre si 
	FinPara
	
	
FinAlgoritmo
