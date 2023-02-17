//Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales repetidas. Al final el procedimiento mostrará la frase final.
//Por ejemplo:
//Entrada: "Habia una vez un barco"
//Salida: "Habi un vez n brco"
//Se marcan en rojo las repetidas sólo para explicar la consigna. Las vocales ?e?, ?i? y ?o? quedan al no estar repetidas.
Algoritmo ejercicioextra13_vocalesrepetidas
	definir frase,convertida Como Caracter
	Escribir "Ingresa una frase"
	Leer frase
	frase= Mayusculas(frase)
	Escribir ""
	Eliminarvocales(frase)
	Escribir ""
	Escribir "La frase inicial es: ",frase
	
FinAlgoritmo

SubProceso Eliminarvocales(frase)
	definir i,c,ce,ci,co,cu Como Entero
	definir letra Como Caracter
	c=0
	ce=0
	ci=0
	co=0
	cu=0
	Para i = 0 hasta Longitud(frase)-1 Hacer
		letra = Subcadena(frase,i,i)
		segun letra Hacer
			'A':
				c = c +1
				si c=0 o c==1 Entonces
					escribir Sin Saltar letra
				SiNo
					si c>=2  Entonces
						letra = Subcadena(frase,i+1,i+1)
					FinSi
				FinSi
			
			'E':
				ce = ce +1
				si ce=0 o ce==1 Entonces
					escribir Sin Saltar letra
				SiNo
					si ce>=2  Entonces
						letra = Subcadena(frase,i+1,i+1)
					FinSi
				FinSi
			'I':
				ci= ci +1
				si ci=0 o ci==1 Entonces
					escribir Sin Saltar letra
				SiNo
					si ci>=2  Entonces
						letra = Subcadena(frase,i+1,i+1)
					FinSi
				FinSi
			'0':
				c0 = c0 +1
				si co=0 o co==1 Entonces
					escribir Sin Saltar letra
				SiNo
					si c0>=2  Entonces
						letra = Subcadena(frase,i+1,i+1)
					FinSi
				FinSi
			'U':
				cu = cu +1
				si cu=0 o cu==1 Entonces
					escribir Sin Saltar letra
				SiNo
					si cu>=2  Entonces
						letra = Subcadena(frase,i+1,i+1)
					FinSi
				FinSi
			De Otro Modo:
				escribir Sin Saltar letra
		FinSegun
	FinPara
	Escribir ""
	
FinSubProceso
	