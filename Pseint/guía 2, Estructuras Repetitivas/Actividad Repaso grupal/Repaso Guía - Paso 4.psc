Algoritmo sin_titulo
//////Ingresar Botellas: Primero preguntaremos cu�ntas botellas se va a ingresar al sistema. Una vez
//que tenemos el n�mero vamos a usar un bucle para, a fin de ir ingresando cada botella. En
//	cada ciclo del bucle se debe generar un n�mero aleatorio entre 100 y 3000 gr, que va a ser el
//	peso de las botellas a reciclar (simulando que el usuario est� ingresando botellas en la
//	m�quina). Una vez generado, seg�n el peso del material, usaremos un condicional m�ltiple
/// para asignarle un valor monetario:
	Definir Login Como Logico
	Definir usuario, contrasena, respuesta Como Caracter
	definir Intentos Como Entero
	definir botellas como entero
	
	//Inicializaci�n
	Intentos=1
	
	Escribir "Ingrese Usuario: "
	leer usuario
	Escribir "Ingrese Contrase�a: "
	leer contrasena
	Login=contrasena='caramelosDeLimon'
	//validaremos que el usuario sea "Albus_D",
	si usuario='Albus_D' Entonces
		//si contrasena='caramelosDeLimon' Entonces
		//Bucle Mientras: Este bloque de validaci�n de la contrase�a lo encerraremos en un bucle
		//	Mientras para darle al usuario s�lo 3 intentos para poner la contrase�a.
		//	
	
		Mientras intentos<=2 Y Login=Falso 
			intentos=intentos+1
			
		Login=contrasena='caramelosDeLimon'
		Escribir "El usuario o la contrase�a no coinciden, por favor Ingrese Contrase�a: "
		leer contrasena
		FinMientras
			//FinSi
	FinSi
	

	//Bucle Hacer Mientras(Repetir): Una vez que el login sea verdadero, accederemos al men� de
//opciones: "Ingresar botellas", "Consultar saldo" y "Salir"
	
	hacer 
		escribir " 1 Ingresar botellas"
		escribir " 2 Consultar saldo"
		escribir " 3 Salir"
		leer respuesta
		Segun respuesta Hacer
			"1": 
				escribir "Ingresar botellas"
				leer botellas 
				azar(100,3000)
			"2":
				leer "Consultar saldo"
			"3":
				escribir "salir"
			De Otro Modo:
				secuencia_de_acciones_dom
		Fin Segun
	Mientras Que respuesta <>"3"
	
	
	
FinAlgoritmo
