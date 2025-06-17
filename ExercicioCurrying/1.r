# Currying

# taxaConvencional <- function(aliquoa, preco) {
# return (aliquoa * preco)
#}

taxar <- function(aliquoa) {
  function(preco) {
    preco * aliquoa
  }
}
taxar(10)(5)