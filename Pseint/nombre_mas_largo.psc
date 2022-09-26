Algoritmo nombre_mas_largo
	Definir primerNombre,segundoNombre Como Caracter
	Definir largoPrimerNombre,largoSegundoNombre,masLargo Como Entero
	Escribir  "Ingresar primer nombre"
	Leer primerNombre
	
	Escribir  "Ingresar segundo nombre"
	Leer segundoNombre
	
	largoPrimerNombre <- Longitud(primerNombre)
	
	largoSegundoNombre <- Longitud(segundoNombre)
	
	Si largoPrimerNombre = largoSegundoNombre Entonces
		Escribir  "Son iguales"
	FinSi
	
	Si largoPrimerNombre >= largoSegundoNombre Entonces
		masLargo <- largoPrimerNombre
	SiNo
		masLargo <- largoSegundoNombre
	FinSi
	
	Escribir  "El mas del mas largo tiene : ",masLargo," caracteres"
	
FinAlgoritmo
