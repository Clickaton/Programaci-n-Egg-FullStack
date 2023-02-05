//Realizar una función que calcule la suma de los dígitos de un número.


Algoritmo ejercicio10_Guia3
	
	definir num Como Entero
	
	Escribir Sin Saltar "dime un numero y sumare sus digitos: "
	leer num
	
   sumarDigitos(num)
	
	Escribir "la suma de sus digitos es ", num
	
FinAlgoritmo






/// a num en el SubProceso lo llamo sumador para modificar su valor a la suma 
/// de sus digitos. aca tambien se podria usar una 2da variable donde guardar la suma
/// y otra donde  guarde num. En este caso opte por simplemente modificar el valor de num

SubProceso sumarDigitos(sumador Por Referencia)
	
	// se define e inicializa las variables de apoyo
	
	Definir auxiliar, resto Como real
	
	
	/// anotancion: sumador es igual a num 
	
	auxiliar = sumador // auxiliar = num
	resto = 0
	sumador = 0  // aca a sumador(num) lo igualo a 0 para guardar la suma de sus digitos
	
	hacer 
		
		resto = auxiliar%10 
		
		sumador = sumador + resto // en sumador voy acumulando la suma de los restos
		
		/// importante!! truncar esta operacion para no tener decimales
		auxiliar = trunc(auxiliar/10) // aca se genera la condicion del bucle
	Mientras Que 
	
	
FinSubProceso
	