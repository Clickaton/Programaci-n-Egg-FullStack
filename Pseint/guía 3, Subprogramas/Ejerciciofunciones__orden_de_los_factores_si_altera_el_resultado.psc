//Una funcion puede ir tanto arriba del Algoritmo, como abajo. En la practica, se suele
//utilizar abajo

Algoritmo Ejerciciofunciones__orden_de_los_factores_si_altera_el_resultado
	
	Definir num1, num2 Como Entero
	
	Escribir "Ingrese dos numeros enteros:"
	Leer num1, num2
	
	//En los argumentos de una llamada de funcion, debemos ingresar las variables que se
	//quieran mandar, por su propio nombre dentro de su propia funcion
	//El orden de los argumentos, debe ser sumamente importante a la hora de llamar
	//a la funcio. Ejemplo, si hacemos 10-7, el resultado logicamente es 3, pero si primero
	//Mandamos el segundo numero y luego el primero, el programa haria 7-10, lo cual nos daria
	//un resultado correcto pero no el que nosotros querriamos
	Escribir "El resultado es: " funcion_resta(num1, num2)
	//funcion_resta(num2, num1) haria que se resten dentro de la funcion el num2 - num1, ya que
	//Al entrar en la funcion, n1 = num2, y n2 = num1
FinAlgoritmo

//Variable de retorno sera la variable que queremos que la funcion
//Devuelva al programa principal

//Argumentos, van a ser todas las variables que nosotros queremos que entren en la funcion
//Para ser usadas. Los argumentos no necesariamente deben poseer el mismo nombre que lo que debe
//entrar. Son una especie de definicion de las variables para su propia funcion
Funcion resultado <- funcion_resta ( n1, n2 )
	//El nombre de una funcion, solo es para identificarla, lo que define realmente
	//la utilizacion de la funcion, es todo lo que se estructure dentro
	
	//Dentro de la funcion, debemos definir una variable de "retorno"
	Definir Resultado como entero
	
	//empezar a designar el procedimiento para calcular la suma, de igual manera
	//que se hace normalmente
	resultado = n1 - n2
	
Fin Funcion