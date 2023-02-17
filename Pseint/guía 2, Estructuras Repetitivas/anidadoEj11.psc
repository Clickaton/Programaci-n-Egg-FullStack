Algoritmo anidadoEj11
	definir tornillos_def, tornillos_sin_def, num1, num2 como entero
	escribir "Ingrese la cantidad de tornillos defectuosos que produce el operario"
	leer tornillos_def
	escribir "Ingrese la cantidad de tornillos sin defectos que produce el operario"
	leer tornillos_sin_def
	num1=200
	num2=10000
	si tornillos_def>200 Y tornillos_sin_def<10000 Entonces
		escribir "El operario tiene un grado 5 de eficiencia"
	SiNo
		si tornillos_def<200 Y tornillos_sin_def>10000 Entonces
			escribir "El operario tiene un grado 8 de eficiencia"
		SiNo
			si tornillos_def<200 Y tornillos_sin_def<10000 Entonces
				escribir "El operario tiene un grado 6 de eficiencia"
			SiNo
				si tornillos_def>200 Y tornillos_sin_def>10000 Entonces
					escribir "El operario tiene un grado 7 de eficiencia"
				FinSi
			FinSi
		FinSi
	FinSi
	
	
	
FinAlgoritmo
