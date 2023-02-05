Algoritmo guia2_2_ejercicio_5v2
	definir n, max, min, promedio, suma, ult Como Real
	definir i Como Entero
	escribir "ingrese un numero"
	leer max
	suma=max
	i=0
	hacer 
		Escribir "ingrese otro numero"
		leer ult
		si ult>max y ult<>0 Entonces
			max=ult
		sino
			min=ult
			
		FinSi
		
		i=i+1
		suma=suma+ult
	Mientras Que ult<>0
	promedio=suma/(i-1)
	escribir "el maximo es: ", max, " el minimo es: ", min, " el promedio es: ", promedio
FinAlgoritmo

