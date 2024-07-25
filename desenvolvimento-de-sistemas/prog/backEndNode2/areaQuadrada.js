const readLineSync = require('readline-sync')

let lado1 = 0.0, quad = 0.0
console.log('======================================')
lado1 = Number(readLineSync.question("Digite o lado do seu quadrado: "))
console.log('======================================')
console.log('')
quad = lado1 * lado1
console.log('======================================')
console.log('A aréa do seu quadrado é: ',quad)
console.log('======================================')