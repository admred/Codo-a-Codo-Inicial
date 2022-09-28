import os
os.system("clear")


miLista = ["Pablo",55,1,30.40,True]
miTupla = tuple(miLista)

print(miTupla)

print(miTupla + (1.3,"pedro",12))
#miTupla.extend(("Mario",233)) # Error

lista2 = list(miTupla)

print(lista2)

creador  =  "Guido Van Rossum","1957-01-31","Belmont","Neerland"

nombre,nacimineto,*_ = creador

print(nombre)
print(nacimineto)
