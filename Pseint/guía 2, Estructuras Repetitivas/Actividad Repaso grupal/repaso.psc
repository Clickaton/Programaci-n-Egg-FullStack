Algoritmo sin_titulo
//	Necesitamos crear un sistema para una m�quina de reciclaje de botellas autom�tica. Dicha
// m�quina nos pagar� dinero por la cantidad de pl�stico reciclado. Tenemos que ingresar nuestro
//	usuario y contrase�a para que se nos cargue el saldo por sistema a nuestra cuenta.
//	     ? Condici�n simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es
//	     verdadero, validaremos si la contrase�a es "caramelosDeLimon". Si la contrase�a es correcta
//		 haremos que una variable llamada Login sea verdadera.
	
	Definir Login Como Logico
	Definir usuario, contrasena, respuesta Como Caracter
	definir Intentos Como Entero
	
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
	Mientras Que respuesta <> "1" y respuesta <> "2" y respuesta <>"3"
	
	
	
	
	
FinAlgoritmo
