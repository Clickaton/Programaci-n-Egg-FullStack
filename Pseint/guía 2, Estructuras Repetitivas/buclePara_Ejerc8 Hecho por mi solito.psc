Algoritmo buclePara_Ejerc8
//	Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
//	N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
//	Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves
//de sus estudiantes:
//	? Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
//	reprueba el curso si tiene una nota final inferior a 6.5
//		? Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
//		? La mayor nota obtenida en las exposiciones.
//		? Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
//		El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
//		las 3 notas y calculará todos informes claves que requiere el docente.	
	
	///Defino variables///
	definir nota_integrador, nota_exposicion, nota_parcial, nota_final, C_REPROB, C_Int, C_Parc, C_exp, intermedios como real
	definir estudiantes, i Como Entero
	//C_Int, C_Parc y C_exp van a funcionar como contadores y los igualamos a 0
	
	///Asigno variables///
	C_int=0
	C_Parc=0
	C_exp=0
	C_REPROB=0
	
	///Desarrollo del programa, ingreso de datos///
	Escribir "Ingrese la cantidad de estudiantes:"
	leer estudiantes
	
	///Desarrollo del menu de cada estudiante con bucle para///
	para i<-1 Hasta estudiantes Hacer
		escribir "estudiante ",i
		Escribir "Ingrese la nota del trabajo integrador:"
		leer nota_integrador
		si nota_integrador > 7.5 Entonces //Porcentaje de alumnos que tienen una
			C_int=C_int+1                  // nota de integrador mayor a 7.5
		FinSi
		Escribir "Ingrese la nota de exposición"
		leer nota_exposicion
		Escribir "Ingrese la nota del parcial"
		leer nota_parcial
		
		//Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
		//reprueba el curso si tiene una nota final inferior a 6.5
		nota_final=0 //asigno Nota final
		si nota_final < 6.5 Entonces
			C_REPROB=C_REPROB+1
			nota_final=nota_integrador*0.35+nota_exposicion*0.25+nota_parcial*0.40
			nota_final=nota_final+nota_final
		FinSi
		
		//La mayor nota obtenida en las exposiciones.
		si nota_exposicion>C_exp Entonces //se va acumulando el número mas alto al ser mayor 
			C_exp=nota_exposicion          //Es retroactivo
		FinSi
		
		//Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
		si nota_parcial > 4 Y nota_parcial < 7.5 Entonces //Atento con el operador "Y" "O" de conjunción y disyunción
			C_Parc=C_Parc+1
		FinSi		
	FinPara
	
	
	Escribir "La Nota promedio final de los estudiantes que reprobaron el curso es de: "  nota_final/C_REPROB
	Escribir "El porcentaje de alumnos que tienen un trabajo integrador es de un " C_int*100/estudiantes
	Escribir "La mayor nota obtenida en las exposiciones es: " C_exp
	Escribir "El total de estudiantes que obtuvieron Un Parcial entre 4 y 7.5 es de: ",C_Parc
	
	
	
	

	
	
	
	
FinAlgoritmo
