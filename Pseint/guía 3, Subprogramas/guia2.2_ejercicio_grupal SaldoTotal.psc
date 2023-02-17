Algoritmo sin_titulo
	definir usuario,contra Como Caracter
	definir intento,botellas,peso,saldo,saldoTotal,pago,respuesta,respuesta2 como real
	definir login como logico
	intento=0
	login=falso
	Mientras intento<3 y login=falso Hacer
		Escribir "Ingrese usuario y contraseña"
		leer usuario
		leer contra
		Si usuario="Albus_D" y contra="caramelosDeLimon" Entonces
			login=Verdadero
			Escribir "Ha ingresado correctamente al sistema"
			Repetir
				Escribir "MENU"
				Escribir "1.Ingresar botellas"
				Escribir "2.Consultar saldo"
				Escribir "3.Salir"
				Leer respuesta
				Si respuesta=1 Entonces
					Escribir "Ingresar numeros de botellas"
					Leer botellas
					saldo=0
					Para botellas<-1 Hasta botellas Con Paso 1 Hacer
						peso=Aleatorio(100,3000)
						Si peso<500
							Escribir "Le corresponden $50"
							pago=50
							saldo=saldo+pago
						SiNo
							Si peso>501 y peso<1500 Entonces
								Escribir "Le corresponden 125$"
								pago=125
								saldo=saldo+pago
							SiNo
								Si peso>1501 Entonces
									Escribir "Le corresponden $200"
									pago=200
									saldo=saldo+pago
								FinSi
							FinSi
						FinSi
					Fin Para
					Escribir "Se le ofrece un monto de " , saldo 
					Escribir "Acepta el monto ofrecido? Ingrese 1 o 2 para continuar" 
					Escribir "1.Si"
					Escribir "2.No"
					leer respuesta2
					Si respuesta2=1 Entonces
						Escribir "Saldo acreditado"
						saldoTotal = saldo
					SiNo
						SI respuesta2=2 Entonces
							Escribir "Devolviendo material"
							saldo=0
						FinSi
					FinSi
				SiNo
					Si respuesta=2 Entonces
						Escribir "El saldo es de " , saldoTotal + saldo
						
					SiNo
						Si respuesta=3 Entonces
							Escribir "Ha salido del programa con exito"
							login=Falso
							
						FinSi
					FinSi
				Fin Si
			Mientras Que login=Verdadero
		SiNo
			login=Falso
			intento=intento+1
			Escribir "Usuario o contraseña incorrectos"
		Fin Si
	Fin Mientras
	Si intento=3 Entonces
		Escribir "No quedan intentos disponibles"
	FinSi
FinAlgoritmo
