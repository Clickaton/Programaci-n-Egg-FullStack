Algoritmo Simbolos
	
	Definir p Como Caracter
	
	Escribir "Escribir una frase" 
	leer p 
    transformar(p)
	
	
FinAlgoritmo

SubProceso  transformar (palabra por referencia)
	definir i Como Entero
	definir a, palabra_nueva, m Como caracter
	definir n Como Entero
	
	palabra_nueva = ""
	
	Repetir
		escribir "ingrese una frase que termine en un punto"
		leer palabra
		n = longitud(palabra)
		m = subcadena(palabra,n-1,n-1)
		
	Mientras Que m<>"."
	
	Para  i <- 0 Hasta  longitud(palabra)
		a = Subcadena(palabra, i, i)
		segun a 
			"a": palabra_nueva = concatenar(palabra_nueva ,"@")
			"e": palabra_nueva = concatenar(palabra_nueva ,"#")
			"i": palabra_nueva = concatenar(palabra_nueva ,"$") 
			"o": palabra_nueva = concatenar(palabra_nueva ,"%") 
			"u": palabra_nueva = concatenar(palabra_nueva ,"*") 
			De Otro Modo: palabra_nueva = palabra_nueva + a
		    
		FinSegun
		
	FinPara
	Escribir palabra_nueva
	palabra = palabra_nueva
	
FinSubProceso
