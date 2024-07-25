const readLineSync = require('readline-sync')
const Piramide = require('./piramideClass')

console.log('==============================================')
let areaBase = Number(readLineSync.question('Digite o valor da area da base da piramide: '))
let altura = Number(readLineSync.question('Digite o valor da altura da piramide: '))

const piramide1 = new Piramide(areaBase,altura)

let volume = piramide1.calcularVolume()

console.log('O volume da piramide é: ',volume.toFixed(2))
console.log('================================================')