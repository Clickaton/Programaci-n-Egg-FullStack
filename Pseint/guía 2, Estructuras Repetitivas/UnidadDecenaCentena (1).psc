Algoritmo UnidadDecenaCentena
	definir num1 Como Real
	Escribir "Ingresar las 3 cifras :"
	leer num1
	definir unidad Como real
	definir decena Como real
	definir centena Como real
	centena=num1/100
	escribir "centena: " trunc(centena)
	decena=num1/100
	decena=num1 mod 100
	decena=decena/10
	escribir "decena: " trunc(decena)
	unidad=num1/10
	unidad=num1 mod 10
	unidad=unidad/1
	escribir "unidad: " unidad
	
	
	
	
	
FinAlgoritmo
