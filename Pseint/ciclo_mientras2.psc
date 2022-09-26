Algoritmo ciclo_mientras2
	Definir encontrado Como Logico
	Definir intentos , numeroEncontrar Como Entero
	Escribir "Ingrese numero del 0 al 100"
	Leer numeroEncontrar
	encontrado <- Falso
	Mientras no encontrado  Hacer
		Si numeroEncontrar == azar(100) Entonces
			encontrado <- Verdadero
		FinSi
		intentos <- intentos + 1
	FinMientras
	Escribir  "Su nro se encontro luego de ",intentos
FinAlgoritmo
