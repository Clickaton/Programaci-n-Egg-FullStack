//	Realizar un programa que pida al usuario el horario en el que se conectó al zoom. Si ese horario
//	está entre la hora de ingreso y la hora de ingreso + los 15? de tardanza, mostrará un mensaje por
//	pantalla que diga "Llegaste a tiempo, tienes presente". Si el horario de ingreso supera ese límite,
//	se mostrará un mensaje por pantalla que diga "Hoy tendrás tardanza. Recuerda avisarle a tus
//	coaches cuando llegarás tarde. Mañana te esperamos a tiempo, tu participación en el equipo es VITAL"


Algoritmo ACtividad_zoom
	definir hora_ingreso, hora_curso como real
	hora_curso=19.00
	Escribir "Ingrese el horario al que ingresó a la llamada de zoom"
	leer hora_ingreso
	si hora_ingreso<19 Entonces
		Escribir "Aún es temprano para la clase"
	FinSi
	si hora_ingreso>=19 Y hora_ingreso<=19.15 Entonces
		escribir "Llegaste a tiempo, tienes presente"
	SiNo
		si hora_ingreso>19.15 Entonces
			Escribir "hoy tendras tardanza, recuerda avisarle a tus coaches cuando llegaràs tarde."
		FinSi
	FinSi
	
	
FinAlgoritmo
