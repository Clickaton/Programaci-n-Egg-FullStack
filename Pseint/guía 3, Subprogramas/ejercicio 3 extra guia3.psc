//Crear una funci�n llamada "Login", que recibe un nombre de usuario y una contrase�a y que
//devuelve Verdadero si el nombre de usuario es "usuario1" y si la contrase�a es "asdasd".
//		Adem�s, la funci�n calculara el n�mero de intentos que se ha usado para loguearse, tenemos
//			solo 3 intentos, si nos quedamos sin intentos la funci�n devolver� Falso.

Funcion acceder = login(usuario,contrasena)
	Definir acceder como logico
	definir i Como Entero 
	acceder=Falso
	i=1
	
	
	hacer 
		escribir " Por favor ingrese su usuario", " tiene ", 4-i, " intento/s"
		leer usuario 
		Escribir "Ingrese su contrase�a"
		leer contrasena 
		i=i+1
	Mientras Que usuario <> "usuario1" y i<=3 y contrasena <> "asdasd" 
	
	si usuario = "usuario1" Y contrasena = "asdasd" Entonces
		acceder=Verdadero
	FinSi
	
	Escribir acceder
	
	
	
	
	
	
FinFuncion


Algoritmo G3Extra_ej3
	Definir usuario, contrasena Como Caracter
	Definir condicion Como Logico
	//asigno variables de caracter para que la funci�n comience con un valor de caracter que luego ser� modificado
	usuario=""
	contrasena=""
	condicion=login(usuario,contrasena)
	
	
	
FinAlgoritmo
