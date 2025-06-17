const cachorro = {
    nome: "Totó",
    idade: 3,
    dono: {
        nome: "Amélia",
        idade: 32
    },
    latir: function() {
        console.log("Au au!");
    }
};
console.log(cachorro.dono.nome);
cachorro.latir();