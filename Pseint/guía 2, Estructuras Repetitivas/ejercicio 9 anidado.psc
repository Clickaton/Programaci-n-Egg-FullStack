
//	Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
//	m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
//	recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
//	compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
//	vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
//	deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//		vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
//cada venta.

Algoritmo sin_titulo
	definir vendedores,ventas,sueldo_base,comision, valor_venta, sueldo_total, monto  Como real
	Definir opciones, i, j Como entero
	Escribir "digite cantidad vendedores"
	leer vendedores
	
	
	para i <- 1 hasta vendedores Con Paso 1 Hacer
		Escribir "ingrese sueldo base semanal"
		leer sueldo_base
		Escribir "ingrese cantidad ventas"
		leer ventas
		para j <- 1 Hasta ventas con paso 1 Hacer
			Escribir " Ingrese el valor de cada venta " j
			leer monto
			valor_venta = 0
			valor_venta = valor_venta + monto
			
		FinPara
		Escribir " Escriba 1 si desea saber cuanto tiene que abonar al vendedor. "
		leer opciones
		comision = ((ventas * valor_venta) * 0.1) / 4
		sueldo_total = comision + sueldo_base
		Segun opciones Hacer
			1 :
				Escribir " el dinero a abonar como estado de comisiones semanal es " comision
				Escribir " el sueldo total a abonar es de " sueldo_total
				
			De Otro Modo:
				Escribir " valor invalido "
		Fin Segun
	
	FinPara
	

	
FinAlgoritmo
