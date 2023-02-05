//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//	es una ?A?. Si la primera letra es una ?A?, se deberá de imprimir un mensaje por pantalla
//	que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO". Nota:
//		investigar la función Subcadena de PseInt.
Algoritmo condicionalDoble_ej7
	definir palabra, cadena1 Como Caracter
	Escribir "Ingrese una palabra que comience con la misma letra que termina:"
	leer cadena1
	palabra=subcadena(cadena1,0,0)
	si palabra = "a" Entonces
		escribir "CORRECTO"
	SiNo
		escribir "vuelve a intentarlo"
	FinSi
	
	
FinAlgoritmo
