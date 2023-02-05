Algoritmo CambioMonedas
	definir peso, euro, dolar Como Real
	Escribir "Por favor, ingrese la cifra a calcular:"
	leer peso
	euro = trunc(peso/137)
	dolar= trunc(peso/144)
	Escribir " Su valor en euro es: " euro
	Escribir " Su valor en dóla es: " dolar
FinAlgoritmo
