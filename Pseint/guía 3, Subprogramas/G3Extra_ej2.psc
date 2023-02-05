Funcion cambio <- respuesta ( num )
	definir cambio Como Entero
	cambio=ConvertirANumero(num)

	
	
Fin Funcion

//Diseñar una función que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner números con
//decimales ni letras. Ejemplo: ingresando "100"(carácter) debe convertirse en 100(entero).

Algoritmo G3Extra_ej2
	definir num como cadena
	definir palabra Como caracter

	mientras Longitud(num)>3
		Escribir "Escribir un número entero de hasta 3 dígitos: NO USAR CARACTER"
		leer num
	FinMientras
	
	
	
	
	escribir respuesta(num)
	
FinAlgoritmo
