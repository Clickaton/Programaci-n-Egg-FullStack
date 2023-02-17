//Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
//N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
//Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves
//de sus estudiantes:
//	? Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
//	reprueba el curso si tiene una nota final inferior a 6.5
//		? Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
//		? La mayor nota obtenida en las exposiciones.
//		? Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
//		El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
//		las 3 notas y calculará todos informes claves que requiere el docente.

Algoritmo Ejercicio8_Bucle_guia2_2
	Definir nota_parcial, trabajo_integrador, exposicion, nota_mayor, reprobados, nota_final, i, promedio_desaprobados, promocion, estudiantes_medio Como Real
	definir total_alumnos como entero
	Escribir "Ingrese la cantidad de alumnos:"
	leer total_alumnos
	reprobados=0
	promedio_desaprobados=0
	promocion=0
	nota_mayor=0
	estudiantes_medio = 0
	para i = 1 hasta total_alumnos Hacer
		Escribir "Ingrese la nota del trabajo práctico integrador del alumno: " i
		leer trabajo_integrador
		Escribir "Ingrese la nota de la exposición del alumno: " i
		leer exposicion
		Escribir "Ingrese la nota del parcial del alumno: " i
		leer nota_parcial
		nota_final=(trabajo_integrador*0.35)+(exposicion*0.25)+(nota_parcial*0.40)
		
	//	? Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
	//	reprueba el curso si tiene una nota final inferior a 6.5
		si nota_final<6.5 Entonces
			reprobados=reprobados+1
			promedio_desaprobados=promedio_desaprobados+nota_final
			
		FinSi
	//		? Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
		si trabajo_integrador>7.5 Entonces
			promocion=promocion+1
		FinSi
	//		? La mayor nota obtenida en las exposiciones.
		si exposicion>Nota_Mayor Entonces
			nota_mayor=exposicion
		FinSi
		//		? Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
		Si nota_parcial >= 4 y nota_parcial <= 7.5 Entonces
			estudiantes_medio = estudiantes_medio + 1
		
		FinSi
		
	FinPara
	Si reprobados = 0 Entonces
		Escribir "No hubo alumnos reprobados"
	SiNo
		escribir "Nota promedio final de los estudiantes que reprobaron el curso: " promedio_desaprobados/reprobados
	FinSi
	escribir "Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5: " (promocion * 100) / total_alumnos "%"
	escribir "La mayor nota obtenida en las exposiciones: " nota_mayor
	escribir "Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5: " estudiantes_medio
	
	
	
FinAlgoritmo
