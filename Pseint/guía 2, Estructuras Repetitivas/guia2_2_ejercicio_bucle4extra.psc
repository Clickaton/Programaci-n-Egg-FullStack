Algoritmo guia2_2_ejercicio_bucle4extra
	
//	Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
//calcula seg�n el siguiente criterio: la parte pr�ctica vale el 10%; la parte de problemas
//	vale el 50% y la parte te�rica el 40%. El programa leer� el nombre del alumno, las tres
//	notas obtenidas, mostrar� el resultado por pantalla, y a continuaci�n volver� a pedir los
//	datos del siguiente alumno hasta que el nombre sea una cadena vac�a. Las notas deben
//	estar comprendidas entre 0 y 10, y si no est�n dentro de ese rango no se imprimir� el
//		promedio y se mostrar� un mensaje de error.
	
	Definir califPract, califProb, caliTeo, calificacionTotal Como Real
	definir nombre Como Caracter
	
	escribir "ingrese su nombre: " 
	leer nombre 
	
	
	Hacer
		escribir " ingrese sus calificaciones (Practica, problema y teorica): "	
		leer califPract, califProb, caliTeo
	Mientras que califPract <= 0 y califProb<=0 y caliTeo<= 0
	
	calificacionTotal= (califPract*0.1) + (califProb*0.5) + (caliTeo*0.4)

	Escribir "su calificacion Total es de: " calificacionTotal
	
FinAlgoritmo



mientras (califPract <= 0 y califPract >= 10) y (califProb >= 0 y califProb <= 10 ) y (caliTeo >=0 y caliTeo <=10)