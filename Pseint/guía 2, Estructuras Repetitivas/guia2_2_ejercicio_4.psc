Algoritmo sin_titulo
	//Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
	//una clave. Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá
	//mostrar un mensaje indicándonos que hemos agotado esos 3 intentos. Si acertamos la
	//clave se deberá mostrar un mensaje que indique que se ha ingresado al sistema
	//correctamente.
	definir clave Como Caracter
	definir i como entero
	i=1
	hacer
		Escribir "Intente adivinar la clave correcta, tiene 3 intentos"
		Escribir "Intento ", i
		leer clave
		i=i+1
	Mientras Que clave<>"eureka" Y i<=3
	si clave="eureka" Entonces
		Escribir "Felicidades! ha adivinado la clave!"
	SiNo
		Escribir "Se ha quedado sin intentos"
	FinSi
FinAlgoritmo
