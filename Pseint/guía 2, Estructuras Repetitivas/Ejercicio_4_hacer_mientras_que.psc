//Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
//una clave. Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá
//		mostrar un mensaje indicándonos que hemos agotado esos 3 intentos. Si acertamos la
//			clave se deberá mostrar un mensaje que indique que se ha ingresado al sistema
//			correctamente.
Algoritmo Ejercicio_4_hacer_mientras_que
	definir palabra, clave Como Caracter
	definir intentos Como Entero
	clave="eureka"
	intentos=1
	Escribir "Ingrese una palabra para adivinar la clave, tiene 3 intentos"
	
	hacer 
		leer palabra
		intentos=intentos+1
		si palabra<>clave Y intentos<3 Entonces
			Escribir "La clave es errónea, intente nuevamente. tiene: ",intentos " intentos" 
			
		FinSi
		si intentos>3 entonces 
			escribir "Se han agotado los 3 intentos..."
		SiNo
			si palabra="eureka"
				Escribir "Excelente, ha adivinado la palabra clave."
			FinSi
		FinSi
	Mientras Que palabra<>clave Y intentos<=3
	


	
	
	
FinAlgoritmo
