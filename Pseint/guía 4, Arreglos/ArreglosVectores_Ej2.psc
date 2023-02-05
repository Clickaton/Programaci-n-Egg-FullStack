//2. Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
//muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al
//arreglo.

Algoritmo ArreglosVectores_Ej2
	Definir vector Como real
	definir i Como Entero
	Dimension vector(10)
	Escribir "Ingresa la totalidad de los elementos del vector"
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		vector(i)=i
		leer vector(i)
		
	Fin Para
	
	sumaVectores(vector)
	MultVectores(vector)
	RestaVectores(vector)
	
FinAlgoritmo
SubProceso sumaVectores(vector Por Referencia)
	definir respuestaSuma Como real
	respuestaSuma=vector(0)+vector(1)+vector(2)+vector(3)+vector(5)+vector(6)+vector(7)+vector(8)+vector(9)+vector(4)
Escribir "La suma de todos los elementos del vector es: ", respuestaSuma	
FinSubProceso

SubProceso MultVectores(vector Por Referencia)
	definir respuestaSMult Como real
	respuestaSMult=vector(0)*vector(1)*vector(2)*vector(3)*vector(5)*vector(6)*vector(7)*vector(8)*vector(9)*vector(4)
	Escribir "La Multiplicación de todos los elementos del vector es: ", respuestaSMult
FinSubProceso

SubProceso RestaVectores(vector Por Referencia)
	definir respuestaSresta Como real
	respuestaSresta=vector(0)-vector(1)-vector(2)-vector(3)-vector(4)-vector(5)-vector(6)-vector(7)-vector(8)-vector(9)
	Escribir "La Resta de todos los elementos del vector es: ", respuestaSresta
FinSubProceso


	