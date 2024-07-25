let resposta1 = document.getElementById('resposta1')
let resposta2 = document.getElementById('resposta2')
let guarda = document.getElementById('guarda')
let calc = document.getElementById('calc')

let array = []
let arrayImpar = []
let somaImpar = 0

guarda.addEventListener('click', ()=>{
    resposta1.innerHTML = ""
    let num = Number(document.getElementById('num').value)
    
    if(array.length >= 10){
        console.log("Limite atingido")
        resposta1.innerHTML += "Limite Atingido <br>"
    }else{
        array.push(num)  
        console.log(array)  
    }
    resposta1.innerHTML += `[ ${array} ]`
})

calc.addEventListener('click', ()=>{
    resposta2.innerHTML = " "
    if(array.length >= 10){
        for(let i = 0; i < array.length; i++){
            if(array[i] % 2 !== 0){
                arrayImpar.push(array[i])
            }
        }
        console.log(arrayImpar)
        for(let i = 0; i < arrayImpar.length;i++){
            somaImpar += arrayImpar[i]
        }
        console.log(somaImpar)
    }
    resposta2.innerHTML += "A soma dos números impares é: "+ somaImpar
    array = []
    arrayImpar = []
    somaImpar = 0
})