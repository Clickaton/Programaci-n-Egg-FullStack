Algoritmo G4_Matriz_ejercicio5
	
	Definir j,i, cont Como Entero
	Definir matriz Como Caracter
	definir palabra Como cadena //Se define como cadena porque en otros lenguajes de programación si no se define así tiraria error.
cont=0
	Dimension matriz(3,3)
	
	hacer //hacer un buque hacer para que la palabra que se ingrese si o si tenga 9 caracteres
		escribir "Ingrese una palabra con 9 caracteres: "
		Leer palabra
		
	Mientras Que longitud(palabra)<>	9
	palabramatriz( matriz, i , j , palabra , cont)
	
FinAlgoritmo

subproceso palabramatriz( matriz Por Referencia, i Por Referencia , j Por Referencia , palabra Por Referencia , cont Por Referencia)
	para i<-0 hasta 2 con paso 1 Hacer// Y esta es la formula para rellenar los elementos
		para j <-0 hasta 2 Hacer
			matriz(i,j)=Subcadena(palabra,cont,cont)
			cont=cont+1
		FinPara
		
	FinPara
	
	
	para i<-0 hasta 2 con paso 1 Hacer// Y esta es la formula para imprimir los valores
		para j <-0 hasta 2 Hacer
			Escribir matriz(i,j), " | " sin saltar
		FinPara
		escribir " " // esto se pone para que se realize el salto de linea y quede las columnas y filas deseadas
	FinPara
FinSubProceso
