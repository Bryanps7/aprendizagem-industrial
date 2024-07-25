const readLineSync = require('readline-sync')
const Cilindro = require('./cilindroClass')

console.log('============ Volume Cilindro ============')
for(let i = 0; i > 3; i++){
    
    let altura = Number(readLineSync.question('Altura do Cilindro: '))
    let raio = Number(readLineSync.question('Raio do Cilindro: '))
    
    const cilindro1 = new Cilindro(altura,raio)
    
    const volume = cilindro1.calcularVolume()
    
    console.log('Volume é: ',volume.toFixed(2))
    i += 1
}