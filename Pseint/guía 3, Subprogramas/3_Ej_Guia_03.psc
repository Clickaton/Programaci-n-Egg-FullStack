

//Crea una función EsMultiplo que reciba los dos números pasados por el usuario, validando que el primer 
//número múltiplo del segundo y devuelva verdadero si el primer número es múltiplo del segundo, sino es múltiplo que devuelva falso.

Algoritmo sin_titulo
	
	Definir num1, num2 Como Entero
	
	Escribir "Ingrese 2 numeros"
	Leer num1, num2
	
	
	Escribir "El numero " num1 " es multiplo de " num2 " ? " multiplo(num1, num2)
	
	
FinAlgoritmo


Funcion Esmultiplo <- multiplo(num1, num2)
	
	Definir Esmultiplo Como Logico
	
	Esmultiplo = num1 mod num2 =0
	
Fin Funcion