Algoritmo Ejercicio9_BucleAnid
//	9. Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
//	m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
//	recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
//	compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
//	vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
//	deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//		vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
	//		cada venta.	
	
	Definir ventas, vendedores, i, v como entero
	Definir sueldo,comision,V_unit,c como real
	ventas=0
	c=0
	
	
	
	
	Escribir "cu�ntos vendedores hay?"
	leer vendedores

	
	para i<-1 hasta vendedores con paso 1 Hacer
		escribir "Vendedor N�",i
		Escribir "cu�l es el sueldo base del vendedor ",i  "?" 
		leer sueldo
		escribir "cu�ntas ventas realiz� el vendedor ",i  "?"
		Leer ventas		
		para v<-1 hasta ventas hacer
			escribir  "De cu�nto fue la venta ",v  "?"
			leer V_unit
			c=c+V_unit
		FinPara
		escribir  ""
		Escribir "El total a pagar de las comisiones es de: " "$" ((10*c)/100)
		Escribir "El total del sueldo final a pagar es de: ",sueldo+((10*c)/100) "$"
		escribir  ""
	FinPara
	
	
	
	
FinAlgoritmo
