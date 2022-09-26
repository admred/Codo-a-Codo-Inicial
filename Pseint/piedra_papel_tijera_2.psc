Algoritmo piedra_papel_tijera_2
	Definir salir Como Logico
	Escribir "Elegir piedra(1) , papel(2), tijera(3), salir(4)"
	salir <- Falso
	Mientras !salir Hacer
		Leer op
		
		pc <- Aleatorio(1,3)
		
		Si op == pc Entonces
			Escribir "Empate"
		SiNo
			Segun op Hacer
				1:
					Si pc == 2 Entonces
						Escribir "Gana PC. Papel mata piedra."
					SiNo
						Escribir "Gana Humano. Piedra mata tijera."
					FinSi
				2:
					Si pc == 3 Entonces
						Escribir "Gana PC. Tijera mata papel. "
					SiNo
						Escribir "Gana Humano. Papel mata piedra."
					FinSi
				3:
					Si pc == 1 Entonces
						Escribir "Gana PC. Piedra mata tijera."
					SiNo
						Escribir "Gana Humano. Tijera mata papel."
					FinSi
				De Otro Modo:
					
					salir <- Verdadero
					
			FinSegun
		FinSi
	FinMientras
	
FinAlgoritmo
