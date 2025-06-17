function criarVerificadorSenha(senhaCorreta) {
    return function(senhaDigitada) {
        if (senhaDigitada === senhaCorreta) {
            return "Acesso permitido";
        } else {
            return "Senha incorreta";
        }
    };
}
const verificar = criarVerificadorSenha("abc123");
console.log(verificar("senha")); 
console.log(verificar("abc123"));