Algoritmo descuento_en_libros
	Escribir "ingresar primer libro:"
	Leer valorLibro1
	Escribir "Ingrese el monto del libro de JAVA:"
	Leer valorLibro2
	precioTotal<- valorLibro1+valorLibro2
	precioConDesc <- precioTotal*(1-0.23)
	Escribir "Tu total es:",precioTotal
	Escribir  "Tu total con descuento es:",precioConDesc
FinAlgoritmo
