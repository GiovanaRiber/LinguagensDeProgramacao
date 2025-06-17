function soma(x,y) {
    return x + y;
}
console.log(soma(5,2))

const somaArrow = (x,y) => x+y;
console.log(somaArrow(8,2))

function media(n1, n2, n3) { 
    function calcularMedia(a, b, c) {
        return (a + b + c) / 3;
    }
    return calcularMedia(n1, n2, n3);
}
console.log(media(10, 7, 8)); 