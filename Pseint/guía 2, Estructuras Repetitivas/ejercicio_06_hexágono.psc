Algoritmo ejercicio_06_hexagono
	definir lados, apotema, area, perimetro  como real
	Escribir "Por favor ingrese el valor de todos los lados del hex�gono:"
	leer lados
	perimetro=(lados*6)
	apotema=(lados)^2-(lados/2)^2
	apotema=rc(apotema)
	area=(perimetro*apotema)/2
	Escribir "El area del hex�gono es; " area " cm."
	escribir "El per�metro del hex�gono es: " perimetro " cm."
	
	
FinAlgoritmo
