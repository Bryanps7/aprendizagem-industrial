const ler = require('readline-sync')

let nota1 = 0.0, nota2 = 0.0, nota3 = 0.0

console.log('====================================')
nota1 = Number(ler.question('| Digite a Primeira nota: '))
nota2 = Number(ler.question('| Digite a Segunda nota: '))
nota3 = Number(ler.question('| Digite a Terceira nota: '))
console.log('====================================')
console.log('')
let mediaNota = (nota1 + nota2 + nota3) / 3.0
let resul = 0
if((mediaNota >= 7.0)&&(mediaNota < 10.0)){
    resul = "Você está aprovado"
}else if((mediaNota >= 5.0)&&(mediaNota < 7.0)){
    resul = "Voce precisa fazer uma recuperação"
}else if((mediaNota >= 0.0)&&(mediaNota < 5.0)){
    resul = "Você terá que fazer todas as avaliações"
}else{
    resul = "Erro de sistema"
}
console.log('====================================')
console.log("Nota 1: ",nota1)
console.log("Nota 2: ",nota2)
console.log("Nota 3: ",nota3)
console.log('A média do aluno é: ',mediaNota.toFixed(2))
console.log('------------------------------------')
console.log(resul)
console.log('====================================')

