Algoritmo ejercicioIntegrador_Guia3
	
//	Definir Estadomenu Como Logico
//	Estadomenu = Verdadero
//	Hacer
		Menu()
//	Mientras Que Estadomenu = Verdadero
FinAlgoritmo



SubProceso menu()
	
	Definir option Como Entero
	Escribir "---------------------------------"
	Escribir "      BIENVENIDO AL MENU!!!!!"
	Escribir "---------------------------------"
	Escribir "   "
	Escribir "1 - Calcular muro de ladrillo"
	Escribir "2 - Calcular viga de hormigón"
	Escribir "3 - Calcular columnas de hormigón"
	Escribir "4 - Calcular contrapisos"
	Escribir "5 - Calcular techo"
	Escribir "6 - Calcular pisos"
	Escribir "7 - Calcular pintura"
	Escribir "8 - Calcular iluminación"
	Escribir "9 - Salir"
	leer option
	
	segun option Hacer
		1: calcularMuro()
		2: calcularViga()
		3: calcularColumna()
		4: calcularContrapiso()
		5: calcularTecho()
		6: calcularPiso()
		7: calcularPintura()
		8: calcularIluminacion()
		9:  escribir " ************************************" 
			escribir "     Espero haber sido de ayuda "
			escribir "    De parte de los clandestinos "
			Escribir " ************************************ "
		De Otro Modo:
			Escribir "opcion invalida, te regresare al menu"
			menu()
		
	FinSegun
FinSubProceso



/// SubProcesos para opcion 1!!!
SubProceso calcularMuro()
	
	Definir grosor,largo, altura Como Entero
	Definir volumen, superficie Como Real
	
	Escribir "dime el grosor que desea para el muro:"
	Escribir "1 - 20 cm"
	Escribir "2 - 30 cm"
	leer grosor
	
	validarGrosor(grosor)

    escribir "ingrese el largo del muro en metros"
    leer largo
    escribir " ingrese el alto del muro en metros"
    leer altura
	
	superficie = CalculoSuperficie(largo,altura)
	volumen = CalculoVolumen(largo, altura, grosor)
	
	calculoMateriales(superficie, volumen, grosor)

FinSubProceso



/// SubProceso auxiliar para la opcion 1
SubProceso validarGrosor(grosor Por Referencia)
	
	Segun grosor hacer
		1: grosor = 20
		2: grosor = 30
		De Otro Modo:
			Escribir "opcion invalida"
			calcularMuro()
	FinSegun
FinSubProceso

Funcion resultado = CalculoSuperficie(largo,altura)
	Definir resultado como real
	resultado = largo * altura
FinFuncion

Funcion resultado = CalculoVolumen(largo, altura, grosor)
	Definir resultado Como Real
	resultado=largo*altura*grosor
FinFuncion

SubProceso calculoMateriales(superficie, volumen,grosor)
	Definir cemento, ladrillos, arena Como Real
	si grosor = 20 Entonces
		cemento = volumen*10.9 // cemento es por kilo
		ladrillos = superficie * 90
		arena = volumen * 0.09
	SiNo
		cemento = volumen*15.2 // cemento es por kilo
		ladrillos = superficie * 120
		arena = volumen * 0.115
	FinSi
	Escribir "------------------------------------------------------"
	Escribir "   !!La cantidad de materiales que vas a usar es.!!"
	Escribir "------------------------------------------------------"
	Escribir "   "
	Escribir "la cantidad de cemento que necesitas es " cemento, " kilos"
	Escribir  "la cantidad de ladrillos es de ", ladrillos
	Escribir  "la cantidad arena es de ", arena " m3"
	Escribir ""
	Escribir ""
	menu()

	FinSubAlgoritmo
	
	/// subprocesos para opcion 2
	
	SubProceso calcularViga()
		definir largoViga, arena,cemento, piedra,hierroDel8,hierroDel4 Como real
		Escribir "dime el largo de las Vigas "
		leer largoViga
		
		cemento = largoViga * 9
		arena = largoViga * 0.02
		piedra = largoViga * 0.02
		hierroDel8= largoViga * 4
		hierroDel4 = largoViga * 3
		Escribir "------------------------------------------------------"
		Escribir "   !!La cantidad de materiales que vas a usar es.!!"
		Escribir "------------------------------------------------------"
		Escribir " "
		Escribir "la cantidad de cemento es de ", cemento, " kilos"
		Escribir "la cantidad de arena es de ", arena, " m3"
		Escribir "la cantidad de piedra es de ", piedra, " m2"
		Escribir "la cantidad de hierro del 8 es de ", hierroDel8, " m"
		Escribir "la cantidad de hierro del 4 es de ", hierroDel4, " m"
		menu()
		Escribir " "
    FinSubProceso
		
	SubProceso calcularColumna()
		definir largoColumna, arena,cemento, piedra,hierroDel10,hierroDel4 Como real
		Escribir "dime el largo de las Columnas "
		leer largoColumna
		
		cemento = largoColumna * 7.5
		arena = largoColumna * 0.016
		piedra = largoColumna * 0.016
		hierroDel10 = largoColumna * 6
		hierroDel4 = largoColumna * 3
		Escribir "------------------------------------------------------"
		Escribir "   !!La cantidad de materiales que vas a usar es.!!"
		Escribir "------------------------------------------------------"
		Escribir " "
		Escribir "la cantidad de cemento es de ", cemento, " kilos"
		Escribir "la cantidad de arena es de ", arena, " m3"
		Escribir "la cantidad de piedra es de ", piedra, " m2"
		Escribir "la cantidad de hierro del 10 es de ", hierroDel10, " m"
		Escribir "la cantidad de hierro del 4 es de ", hierroDel4, " m"
		menu()
		Escribir " "
FinSubProceso

SubProceso calcularContrapiso()
	Definir espesor, largo, ancho, cemento, arena, piedra, m3 Como Real
	Escribir "dime el espesor del contrapiso "
	Leer espesor
	Escribir "dime el largo del contrapiso "
	leer largo
	Escribir "dime el ancho del contrapiso "
	leer ancho
	
	m3 = espesor * largo * ancho
	
	cemento =  m3 * 105
	arena = m3 * 0.45
	piedra = m3 * 0.9
	
	Escribir "------------------------------------------------------"
	Escribir "   !!La cantidad de materiales que vas a usar es.!!"
	Escribir "------------------------------------------------------"
	Escribir " "
	Escribir "la cantidad de cemento es de ", cemento, " kilos"
	Escribir "la cantidad de arena es de ", arena, " m3"
	Escribir "la cantidad de piedra es de ", piedra, " m3"
	Escribir " "
	menu()
	Escribir " "
	Escribir " "
FinSubProceso
	
SubProceso calcularTecho()
	
	Definir espesor, largo, ancho, cemento, arena, piedra, m3, hierroDel8,hierroDel6 Como Real
	Escribir "dime el espesor del techo "
	Leer espesor
	Escribir "dime el largo del techo "
	leer largo
	Escribir "dime el ancho del techo "
	leer ancho
	
	
	m3 = espesor * largo * ancho
	
	cemento =  m3 * 33
	arena = m3 * 0.072
	piedra = m3 * 0.072
	hierroDel6 = m3 * 4
	hierroDel8 = m3 * 8
	Escribir "------------------------------------------------------"
	Escribir "   !!La cantidad de materiales que vas a usar es.!!"
	Escribir "------------------------------------------------------"
	Escribir " "
	Escribir "la cantidad de cemento es de ", cemento, " kilos"
	Escribir "la cantidad de arena es de ", arena, " m3"
	Escribir "la cantidad de piedra es de ", piedra, " m2"
	Escribir "la cantidad de hierro del 6 es de ", hierroDel6, " m"
	Escribir "la cantidad de hierro del 8 es de ", hierroDel8, " m"
	Escribir " "
	menu()
FinSubProceso
	
SubProceso calcularPiso()
	Definir largo, ancho, m2, pisoTotal Como Real
	Escribir "dime el largo del techo "
	leer largo
	Escribir "dime el ancho del techo "
	leer ancho
	
	m2= largo * ancho
	pisoTotal = m2 * 1.1
	Escribir "---------------------------------------------------------------"
	Escribir "   !!La cantidad de ceramicos/baldosa que vas a usar es.!!"
	Escribir "---------------------------------------------------------------"
	Escribir " "
	Escribir "la cantidad de espacio de piso es de ", pisoTotal, "m2"
	Escribir ""
	menu()
FinSubProceso


SubProceso calcularPintura()
	definir  ancho, largo, litroP, m2 como real
	Escribir " dime el largo de la pared "
	leer largo
	Escribir " dime el ancho de la pared "
	leer ancho
	
	m2 = ancho * largo
	litroP = m2 / 6
	Escribir "------------------------------------------------------"
	Escribir "   !!La cantidad de materiales que vas a usar es.!!"
	Escribir "------------------------------------------------------"
	Escribir " "
	Escribir " La cantadidad de pintura que necesita son " litroP " litros"
	Escribir ""
	menu()
FinSubProceso

SubProceso calcularIluminacion()	
	definir  ancho, largo, m2, iluminacion como real
	Escribir " dime el largo de la pared "
	leer largo
	Escribir " dime el ancho de la pared "
	leer ancho
	
	m2 = ancho * largo
	iluminacion = m2 * 0.20
	Escribir "------------------------------------------------------"
	Escribir "              !!Iluminacion natural.!!"
	Escribir "------------------------------------------------------"
	Escribir " "
	Escribir " La cantidad minima de superficie de iluminacion natural es de " iluminacion
	Escribir ""
	menu()
FinSubProceso
	
	
	
	