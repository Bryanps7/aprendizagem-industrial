let resposta1 = document.getElementById('resposta1')
let resposta2 = document.getElementById('resposta2')
let resposta3 = document.getElementById('resposta3')
let resposta4 = document.getElementById('resposta4')
let resposta5 = document.getElementById('resposta5')

let gerar = document.getElementById('gerar')
let numArray = []
let numImparArray = []
let numParArray = []
let somaArray = 0
let somaParArray = 0

function aleatorio(x){
    let valor = 0
    for(let i = 0; i < x; i++){
         /*valor = Math.floor(Math.random() * (x - 1) + 1)*/
         valor = (Math.random() * (x - 1) + 1).toFixed()
        numArray.push(valor)
    }
    
}

function impares(){
    for(let i=0;i<numArray.length;i++){
        if(numArray[i] % 2 == 1){
            numImparArray.push(numArray[i])
        }else{
            numParArray.push(numArray[i])
        }
    }
}

function soma(){
    for(let i = 0;i < numArray.length; i++){
        somaArray += numArray[i]
    }
    return somaArray
}

function somaPar(){
    for(let i = 0;i < numParArray.length; i++){
        somaParArray += numParArray[i]
    }
    return somaParArray
}

gerar.addEventListener('click', ()=>{
    let quantidade = Number(document.getElementById('quantidade').value)
    numArray = []
    numImparArray = []
    numParArray = []
    numPar = []
    somaArray = 0
    somaParArray = 0

    aleatorio(quantidade)
    impares()
    soma()
    somaPar()

    resposta1.innerHTML = `O valor gerado é = ${numArray}`
    resposta2.innerHTML = `Os valores impares do array são [ ${numImparArray} ]`
    resposta3.innerHTML = `Os valores pares do array são [ ${numParArray} ]`
    resposta4.innerHTML = `A soma dos valores da array é = ${somaArray}`
    resposta5.innerHTML = `A soma dos valores PARES da array é = ${somaParArray}`
})