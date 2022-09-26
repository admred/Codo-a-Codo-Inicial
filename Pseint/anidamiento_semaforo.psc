Algoritmo anidamiento_semaforo
	// Ejemplo en diapositivas
	Escribir "Ingrese color del semaforo [v/a/r]"
	Leer color
	Si color == 'v' O  color == 'V' Entonces
		Escribir  "Pase Tranquilo"
	Sino
		Si color == 'a' O color == 'A' Entonces
			Escribir  "Espere por favor"
		Sino
			Si color == 'r' O color == 'R' Entonces
				Escribir  "PARE !"
			Sino
				Escribir  "Usted no ingreso un valor valido"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
