//Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4
//	caracteres de largo, el programa le concatenara un signo de exclamación al final, y si no
//		es de 4 caracteres el programa le concatenara un signo de interrogación al final. El
//	programa mostrará después la frase final. Nota: investigar la función Longitud() y
//		Concatenar() de PseInt.
Algoritmo CondDoble_Ej5
	definir frase, resultado Como Caracter
	definir carac4 Como Entero
	escribir "Ingrese una frase o palabra:"
	leer frase
	carac4=Longitud(frase)
	si carac4=4 Entonces
		resultado<-Concatenar(frase,"!")
	
	SiNo
		resultado<-Concatenar(frase,"?")
	FinSi
	escribir resultado
	
FinAlgoritmo
