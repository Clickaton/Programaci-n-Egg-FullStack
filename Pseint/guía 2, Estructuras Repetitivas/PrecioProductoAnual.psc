Algoritmo PrecioProductoAnual
	definir precioInicial Como Real
	definir precioFinal Como Real
	definir aumento Como Real
	definir totalAumento Como Real
	definir porcentajeDeAumento Como Real
	escribir "ingrese el precio inicial del producto:"
	leer precioInicial
	escribir "ingrese el precio final del producto:" 
	leer precioFinal
		totalAumento= precioFinal-precioInicial
		porcentajeDeAumento=(totalAumento/precioInicial)*100
		aumento=porcentajeDeAumento
	escribir "El porcentaje de aumento del producto es de: " aumento "%"
FinAlgoritmo
