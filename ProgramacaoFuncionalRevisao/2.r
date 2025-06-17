library(purrr)

numeros <- c(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

pares <- keep(numeros, ~ .x %% 2 == 0)

multiplicados <- map(pares, ~ .x * 3)

soma <- reduce(multiplicados, `+`)
print(soma)