function Cachorro(nome, idade, raca, cor, donoNome, donoIdade) {
    this.nome = nome;
    this.idade = idade;
    this.raca = raca;
    this.cor = cor;
    this.dono = { nome: donoNome, idade: donoIdade };
}
Cachorro.prototype.latir = function() {
    console.log("Au au!");
};
const meuCachorro = new Cachorro("Rex", 2, 
"Golden Retriever", "Dourado", "Amélia", 32);

console.log(meuCachorro.nome); 
console.log(meuCachorro.dono.nome); 
meuCachorro.latir();