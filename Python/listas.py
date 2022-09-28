paises = ['Argentina',"Bolivia","Paraguay","Chile","Uruguay"]

print(paises)

paises.extend(["Ecuador","Brazil","Venezuela","Colombia"])

print(paises)
print(paises[:])

print(paises[:3])
print(paises[3:])

print(paises.index("Chile"))

print(paises[paises.index("Chile")])

paises.append("Peru")
print(paises)

paises.insert(0,"Costa Rica")
print(paises)


print("Brazil" in paises)

paises.remove("Brazil")
print(paises)

print("Brazil" in paises)


print(paises.pop())
print(paises)


p2=paises+["Panama","Salvador","Honduras","Salvador","Cuba","Venezuela","Guatemala"]
print(p2)