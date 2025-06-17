import operator
from functools import reduce

lista = [0, -2, 15, 34, -18, 22, -9]

valores_positivos = list(filter(lambda x:x >= 0, lista))
soma = reduce(operator.add, valores_positivos)
print("Soma de positivos: ", soma)