Algoritmo CondAnid_8
	definir cant_llantas, total, precio1, precio2, precio3 Como Entero
	escribir "Ingrese cantidad de llantas:"
	leer cant_llantas
	precio1=3000
	precio2=2500
	precio3=2000
	si cant_llantas<=5 Entonces
		escribir "el precio por C/U es de $3000"
		escribir "El total a pagar es de: " precio1*cant_llantas
	SiNo
		si cant_llantas>5 Y cant_llantas<10 Entonces
			escribir "el precio por C/U es de $2500"
			escribir "El total a pagar es de: " precio2*cant_llantas
		SiNo
			si cant_llantas>10 Entonces
				escribir "el precio por C/U es de $2000"
				escribir "El total a pagar es de: " precio3*cant_llantas
			FinSi
		FinSi
	FinSi
	
	
	
	

	
	
	
FinAlgoritmo
