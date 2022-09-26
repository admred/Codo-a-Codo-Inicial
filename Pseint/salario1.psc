Algoritmo salario1
	// Problema propuesto de las diapositivas
	Escribir  "Ingresar horas trabajadas"
	Leer horas_trabajadas
	Escribir  "Ingresar tarifa por hora"
	Leer tarifa_x_hora
	
	salario <- tarifa_x_hora*horas_trabajadas
	
	Si horas_trabajadas > 40 Entonces
		salario <- salario+ tarifa_x_hora*0.50*(horas_trabajadas-40)
	FinSi
	
	Escribir  "Salario: ",salario
	
FinAlgoritmo
