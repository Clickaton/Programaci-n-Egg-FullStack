Algoritmo sin_titulo
//	Necesitamos crear un sistema para una máquina de reciclaje de botellas automática. Dicha
// máquina nos pagará dinero por la cantidad de plástico reciclado. Tenemos que ingresar nuestro
//	usuario y contraseña para que se nos cargue el saldo por sistema a nuestra cuenta.
//	     ? Condición simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es
//	     verdadero, validaremos si la contraseña es "caramelosDeLimon". Si la contraseña es correcta
//		 haremos que una variable llamada Login sea verdadera.
	
	Definir Login Como Logico
	Definir usuario, contrasena, respuesta Como Caracter
	definir Intentos Como Entero
	
	//Inicialización
	Intentos=1
	
	Escribir "Ingrese Usuario: "
	leer usuario
	Escribir "Ingrese Contraseña: "
	leer contrasena
	Login=contrasena='caramelosDeLimon'
	//validaremos que el usuario sea "Albus_D",
	si usuario='Albus_D' Entonces
		//si contrasena='caramelosDeLimon' Entonces
		//Bucle Mientras: Este bloque de validación de la contraseña lo encerraremos en un bucle
		//	Mientras para darle al usuario sólo 3 intentos para poner la contraseña.
		//	
	
		Mientras intentos<=2 Y Login=Falso 
			intentos=intentos+1
			
		Login=contrasena='caramelosDeLimon'
		Escribir "El usuario o la contraseña no coinciden, por favor Ingrese Contraseña: "
		leer contrasena
		FinMientras
			//FinSi
	FinSi
	

	//Bucle Hacer Mientras(Repetir): Una vez que el login sea verdadero, accederemos al menú de
//opciones: "Ingresar botellas", "Consultar saldo" y "Salir"
	
	hacer 
		escribir " 1 Ingresar botellas"
		escribir " 2 Consultar saldo"
		escribir " 3 Salir"
		leer respuesta
	Mientras Que respuesta <> "1" y respuesta <> "2" y respuesta <>"3"
	
	
	
	
	
FinAlgoritmo
