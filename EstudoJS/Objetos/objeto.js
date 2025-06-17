const cachorro = {
    nome: "Toó",
    idade: 3,
    raça: "Poodle",
    cor: "Branco",
    latir: function() {
        console.log("Au au!");
    },
    mostrarAtributos: function() {
        console.log(`Nome: ${this.nome}, Idade: ${this.idade}, Raça: ${this.raça}, Cor: ${this.cor}`);
    }
};

cachorro.latir(); 
cachorro.mostrarAtributos(); 
