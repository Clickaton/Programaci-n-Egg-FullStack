Algoritmo sin_titulo
	Definir usuario, key  Como Caracter
	Definir contador, menu, i, botellas, peso, precio2, contador2, contador3, contador4, preciofinal, respuestaB, saldo Como Entero
	definir login, logic como logico
	login = Falso
	logic = Falso
	contador = 0
	i = 0
	contador2 = 0
	contador3 = 0
	contador4 = 0
	
	

	Escribir " ingrese el usuario"
	Leer usuario
	si usuario = "abc" Entonces
		Escribir  " ingrese la contraseña "
		Leer key
		si key = "abc" Entonces
			 login = Verdadero 
			
		SiNo
			Mientras key <> "abc" y contador <= 1 Hacer
				Si key <> "abc" Entonces
					escribir"Contraseña incorrecta"
					leer key
					contador = contador + 1
					si key = "abc" Entonces
						login = Verdadero
						Escribir " Ha ingresado correctamente "
					
					FinSi
					
				FinSi
				
			Fin Mientras
			si contador >= 1 y login = Falso Entonces
				Escribir " Ha alcanzado el limite de intentos "
			FinSi
			
		FinSi
		Repetir
			Escribir " ¡BIENVENIDO AL MENU DE OPCIONES! "
			Escribir " ingrese la opcion que desee"
			Escribir " 1 para ingresar botellas "
			Escribir " 2 para consultar saldo "
			Escribir " 3 para salir "
			Leer menu
		
		Segun menu hacer
			1 : escribir " ingrese cuantas botellas va ingresar "
				Leer botellas
				escribir " Ingreso " botellas " botellas"
				Para i <- 1 hasta botellas Hacer
					peso = Aleatorio(100, 3000)
					si peso <= 500 Entonces
						Escribir" el peso de la botella es " peso
						contador2 = contador2 + 50
						escribir " LLevas " contador2
					FinSi
					si peso  >= 501 y  peso <= 1500  Entonces
						Escribir" el peso de la botella es " peso
						contador3 = contador3 + 125
						Escribir " llevas " contador3
					FinSi
					Si peso > 1501 Entonces
						Escribir " el peso de la botella es " peso
						contador4 = contador4 + 200
						escribir " llevas " contador4
					FinSi
					
				FinPara
				preciofinal = contador2 + contador3 + contador4
				escribir " El precio total de sus botellas son " preciofinal " pesos "
				Escribir " Desea que se le entregue el dinero, 1 para si o 2 para no. "
				Leer respuestaB
				Segun respuestaB Hacer
					1:
						Escribir " Recoja su dinero... "
					2:
						Escribir " Devolviendo botellas... "
					
					
					De Otro Modo:
						Escribir " Caracter invalido "
				Fin Segun
				logic = Verdadero
				
			2 : escribir " Desea conocer su saldo, 1 para si, 2 para no "
				leer saldo
				Segun saldo Hacer
					1:
						Escribir preciofinal
					2:
						Escribir " Ok "
					:
						
					De Otro Modo:
						Escribir " caracter invalido "
				Fin Segun
				logic = Verdadero
				
				
			De Otro Modo:
				Escribir " Ha salido del sistema "
			    logic = Falso
		FinSegun
	Mientras Que logic = Verdadero
		
	FinSi
	

FinAlgoritmo
