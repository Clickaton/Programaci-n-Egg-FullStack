Algoritmo G3_ejer8
	definir num1,num2 Como Entero
	escribir "Ingrese 2 numeros"
	leer num1,num2
	dividir(num1,num2)
FinAlgoritmo


SubAlgoritmo  dividir (num1,num2)
	definir aux,cont,resta Como Entero
	aux= 0
	cont= 0
	//resta = num1-num2
	//aux = resta-num2
	si num2>=aux Entonces
		aux= num1
		Mientras aux>=num2 Hacer
			resta=aux-num2
			aux=resta
			cont= cont+1
		Fin Mientras
		escribir "El resultado es " cont " y el residuo es el " aux
	FinSi
	
FinSubAlgoritmo
