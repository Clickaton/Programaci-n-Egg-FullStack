///Continuando el ejercicio anterior, ahora se pedir� una frase o palabra y se validara si la
///primera letra de la frase es igual a la �ltima letra de la frase. Se deber� de imprimir un
///mensaje por pantalla que diga "CORRECTO", en caso contrario, se deber� imprimir
///"INCORRECTO".


Algoritmo Ej_8_longitud_si_entonces
	definir palabra1, palabra2, frase Como Caracter
	Definir longi Como Entero
	escribir "ingrese la frase"
	leer frase
	
	longi=Longitud(frase)
	palabra1=SubCadena(frase,0,0)
	palabra2=Subcadena(frase,longi-1,longi)
	
	si palabra1 = palabra2 Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
	
	
	
	
FinAlgoritmo
