//	Realizar un programa que pida al usuario el horario en el que se conect� al zoom. Si ese horario
//	est� entre la hora de ingreso y la hora de ingreso + los 15? de tardanza, mostrar� un mensaje por
//	pantalla que diga "Llegaste a tiempo, tienes presente". Si el horario de ingreso supera ese l�mite,
//	se mostrar� un mensaje por pantalla que diga "Hoy tendr�s tardanza. Recuerda avisarle a tus
//	coaches cuando llegar�s tarde. Ma�ana te esperamos a tiempo, tu participaci�n en el equipo es VITAL"


Algoritmo ACtividad_zoom
	definir hora_ingreso, hora_curso como real
	hora_curso=19.00
	Escribir "Ingrese el horario al que ingres� a la llamada de zoom"
	leer hora_ingreso
	si hora_ingreso<19 Entonces
		Escribir "A�n es temprano para la clase"
	FinSi
	si hora_ingreso>=19 Y hora_ingreso<=19.15 Entonces
		escribir "Llegaste a tiempo, tienes presente"
	SiNo
		si hora_ingreso>19.15 Entonces
			Escribir "hoy tendras tardanza, recuerda avisarle a tus coaches cuando llegar�s tarde."
		FinSi
	FinSi
	
	
FinAlgoritmo
