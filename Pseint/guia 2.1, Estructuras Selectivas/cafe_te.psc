Algoritmo cafe_te
	Definir caracter Como Caracter
	Escribir "¿Quiere tomar te o cafe"
	leer Caracter
	caracter=Minusculas(Caracter)
	Si Caracter = "te" Entonces
		Escribir "ok,ya le serviremos te"
	SiNo
		si caracter = "cafe"
		Escribir "¿Como lo quiere cortado o solo?"
		Leer Caracter
		Si Caracter = "solo" Entonces
		 Escribir "ok,ya le serviremos"
	SiNo
	   Si Caracter = "cortado" Entonces
		   Escribir "¿Prefiere leche vegetal o normal?"
		   leer Caracter
		   Si Caracter = "vegetal" Entonces
			   Escribir "ok,ya le servimos"
		   Sino
			   Si Caracter = "normal" Entonces
			    Escribir "ok,ya le servimos"
			   FinSi
		   Fin Si 
	   FinSi
   FinSi
FinSi
FinSi




	
FinAlgoritmo
