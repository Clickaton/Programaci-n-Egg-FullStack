Algoritmo CantidadAlumnos
	Definir masc Como Entero 
	Definir femn Como Entero
	Definir tot Como Entero
	Definir porcm Como Real
	Definir porcf Como Real
	Escribir "Ingrese la cantidad de chicos(género) en el curso"
	Leer masc
	Escribir "Ingrese la cantidad de chicas(género) en el curso"
	Leer femn
	tot= masc + femn
	porcm= (masc*100)/tot
	porcf= (femn*100)/tot
	Escribir "El porcentaje de chicos en el aula es de un ", porcm,"%"
	Escribir "El porcentaje de chicas en el aula es de un ", porcf,"%"
	Escribir "En total hay: " tot " alumnos"
FinAlgoritmo
