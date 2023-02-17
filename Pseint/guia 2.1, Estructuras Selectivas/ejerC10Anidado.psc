Algoritmo ejerC10Anidado
	definir manzanas, precio,total Como Real
	escribir "¿Cúantas manzanas desea comprar?"
	leer manzanas
	precio=10
	si manzanas<=2 Y manzanas>0 Entonces
		total = precio*manzanas
		
	SiNo
		si manzanas>2 Y manzanas<=5 Entonces
			total = precio*manzanas*0.90
			
			
		SiNo
			si manzanas>5 Y manzanas<=10 Entonces
				total=precio*manzanas*0.85
			SiNo
				si manzanas>10 Entonces 
					total=precio*manzanas*0.80
				FinSi
				
			FinSi
		FinSi
	FinSi
Escribir "El total a pagar es de: " total

	
FinAlgoritmo
