let resistividade = 0.0282 // 0,0282 Ω. mm²/m condutor de alumínio

let comprimento = 1555
let areaTransversal = 2.5 // o valor mínimo é 1 para não dividir por zero
let resistencia = 0

resistencia = (resistividade * comprimento) / areaTransversal

console.log("O valor da resistência é = ", resistencia)