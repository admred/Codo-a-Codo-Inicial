Algoritmo piedra_papel_tijera	
	Escribir "Elegir piedra(1) , papel(2) o tijera(3)"
	Leer op
	pc <- Aleatorio(1,3)
	Si op == pc Entonces
		Escribir "Empate"
	SiNo
		Si op == 1 Entonces
			Si pc == 2 Entonces
				Escribir "Perdiste. Papel mata piedra"
			SiNo
				Escribir "Ganaste. Piedra mata a tijera"
			FinSi
		Sino
			Si op == 2 Entonces
				Si pc == 3 Entonces
					Escribir  "Perdiste. Tijera mata papel"
				Sino 
					Escribir  "Ganaste. Papel mata piedra"
				FinSi
			SiNo
				Si op == 3 Entonces
					Si pc == 1 Entonces
						Escribir  "Perdiste. piedra mata tijera"
					SiNo
						Escribir "Ganaste. Tijera mata papel"
					FinSi
				Sino	
					Escribir "opcion no valida"
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
