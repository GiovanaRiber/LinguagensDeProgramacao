def calcular_media(lista):
    return sum(lista) / len(lista)

lista = [21, 4, 5, 6, 10, 20, 30]

media = calcular_media(lista)
lista_filtrada = list(filter(lambda x: x < media, lista))

print(media)
print(lista_filtrada)