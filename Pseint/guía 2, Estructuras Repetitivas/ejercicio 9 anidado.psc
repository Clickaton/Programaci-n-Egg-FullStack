
//	Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
//	múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
//	recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
//	compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
//	vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
//	deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//		vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
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
