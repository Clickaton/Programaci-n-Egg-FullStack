Algoritmo SueldoBase_Comision
	definir sueldo, ventas, extra Como Entero
	Escribir "Ingrese el sueldo base:" 
	leer sueldo
	Escribir "ingrese la cantidad de ventas realizadas:"
	leer ventas
	extra=(sueldo*(ventas*10)/100)+sueldo
	Escribir "El sueldo estimado con las comisiones es de: $ " extra
	
FinAlgoritmo
