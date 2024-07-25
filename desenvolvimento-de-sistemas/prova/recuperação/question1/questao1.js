let resposta1 = document.getElementById('resposta1')
let resposta2 = document.getElementById('resposta2')
let guarda = document.getElementById('guarda')
let calc = document.getElementById('calc')

let array = []
let soma = 0
let media = 0

guarda.addEventListener('click', ()=>{
    resposta1.innerHTML = ""
    let num = Number(document.getElementById('num').value)
    
    if(array.length >= 5){
        console.log("Limite atingido")
        resposta1.innerHTML += "Limite Atingido <br>"
    }else{
        if((num <= 10)&&(num >= 1)){
            array.push(num)  
            console.log(array)  
        }
    }
    resposta1.innerHTML += `[ ${array} ]`
})

calc.addEventListener('click', ()=>{
    resposta2.innerHTML = " "
    for(let i = 0; i < array.length;i++){
        soma = soma + array[i] 
    }
    media = soma / array.length
    console.log("soma: ",soma)
    console.log("media: ",media)
    resposta2.innerHTML += "A média Aritmética é: "+media
    array = []
    soma = 0
    media = 0
})