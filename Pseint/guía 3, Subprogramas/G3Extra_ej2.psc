Funcion cambio <- respuesta ( num )
	definir cambio Como Entero
	cambio=ConvertirANumero(num)

	
	
Fin Funcion

//Dise�ar una funci�n que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podr� recibir n�meros de hasta 3 d�gitos. Nota: no poner n�meros con
//decimales ni letras. Ejemplo: ingresando "100"(car�cter) debe convertirse en 100(entero).

Algoritmo G3Extra_ej2
	definir num como cadena
	definir palabra Como caracter

	mientras Longitud(num)>3
		Escribir "Escribir un n�mero entero de hasta 3 d�gitos: NO USAR CARACTER"
		leer num
	FinMientras
	
	
	
	
	escribir respuesta(num)
	
FinAlgoritmo
