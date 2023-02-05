
//	Una empresa tiene personal de distintas áreas con distintas condiciones de contratación y
//	formas de pago. El departamento de contabilidad necesita calcular los sueldos semanales
//(lunes a viernes) en base a las 3 modalidades de sueldo:
//	a) comisión
//	b) salario fijo + comisión, y
//	c) salario fijo
//	a) Para la modalidad salario por comisión se debe ingresar el monto total de las ventas
//		realizadas en la semana, y el 40% de ese monto total corresponde al salario del
//		empleado.
//		b) Para la condición de salario fijo + comisión, se debe ingresar el valor que se paga por
//			hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en
//			esa semana. En este tipo de contrato las horas extras no están contempladas y se fija
//			como máximo 40 horas por semana. La comisión por las ventas se calcula como 25%
//			del valor de venta total.
//			c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga por
//				hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las 40
//				horas semanales, las horas extras se deben pagar con un extra del 50% del valor de la
//				hora. Realizar un menú de opciones para poder elegir el tipo de contrato que tiene un
//empleado.

Algoritmo sin_titulo
	definir ventas, horas, extra, contrato, salario, valorhora  como real
	definir menu Como Caracter
	escribir "ingresar el tipo de contrato (contrato A) (Contrato B) (Contrato C):"
	leer menu
	Segun menu Hacer
		"a","A":
			escribir "Ingresar el total de ventas realizadas:"
			leer ventas
			salario=ventas*0.40
			Escribir "Su salario es de: " salario 
			
		"b","B":
			escribir "Ingrese la cantidad de horas trabajadas, ventas realizadas y el valor-hora  :  "
			leer horas,ventas,valorhora
			si horas>=40 Entonces
				horas=40
			FinSi
			salario=(horas*valorhora)+(ventas*0.75)
			Escribir "Su salario es de: " salario 
		"c","C":
			escribir "Ingrese el valor-hora y la cantidad de horas trabajadas:"
			leer valorhora, horas
			si horas>40 Entonces
				extra=horas-40
				salario=(horas*valorhora)+(extra*valorhora*1.5)
				Escribir "Su salario es de: " salario 
			SiNo
				salario=horas*valorhora
				Escribir "su salario es de: " salario
			FinSi
			
	Fin Segun
	

	
FinAlgoritmo
