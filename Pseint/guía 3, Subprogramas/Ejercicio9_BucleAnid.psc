Algoritmo Ejercicio9_BucleAnid
//	9. Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
//	múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
//	recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
//	compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
//	vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
//	deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//		vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
	//		cada venta.	
	
	Definir ventas, vendedores, i, v como entero
	Definir sueldo,comision,V_unit,c como real
	ventas=0
	c=0
	
	
	
	
	Escribir "cuántos vendedores hay?"
	leer vendedores

	
	para i<-1 hasta vendedores con paso 1 Hacer
		escribir "Vendedor N°",i
		Escribir "cuál es el sueldo base del vendedor ",i  "?" 
		leer sueldo
		escribir "cuántas ventas realizó el vendedor ",i  "?"
		Leer ventas		
		para v<-1 hasta ventas hacer
			escribir  "De cuánto fue la venta ",v  "?"
			leer V_unit
			c=c+V_unit
		FinPara
		escribir  ""
		Escribir "El total a pagar de las comisiones es de: " "$" ((10*c)/100)
		Escribir "El total del sueldo final a pagar es de: ",sueldo+((10*c)/100) "$"
		escribir  ""
	FinPara
	
	
	
	
FinAlgoritmo
