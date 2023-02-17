Algoritmo condDboleEj1
	definir num1, num2, num3, resultado Como Real
	escribir "Ingrese la primera nota:"
	leer num1
	escribir "Ingrese la segunda nora:"
	leer num2
	escribir "Ingrese la tercer nota:"
	leer num3
	
	resultado=((num1+num2+num3)/3)*10
	
	Si resultado >= 70 Entonces
		escribir "aprobado"
	SiNo
		escribir "desaprobado"
	Fin Si
	

	
FinAlgoritmo
