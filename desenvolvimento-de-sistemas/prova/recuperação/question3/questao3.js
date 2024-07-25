let resposta1 = document.getElementById('resposta1')
let resposta2 = document.getElementById('resposta2')
let guarda = document.getElementById('guarda')
let calc = document.getElementById('calc')

let array = []
let array3 = []
let soma3 = 0

guarda.addEventListener('click', ()=>{
    resposta1.innerHTML = ""
    let num = Number(document.getElementById('num').value)
    
    if(array.length >= 5){
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
    if(array.length >= 5){
        for(let i = 0; i < array.length; i++){
            if(array[i] % 3 == 0){
                array3.push(array[i])
            }
        }
        console.log(array3)
        for(let i = 0; i < array3.length;i++){
            soma3 += array3[i]
        }
        console.log(soma3)
    }
    resposta2.innerHTML += "A soma dos números divisiveis por 3 é: "+ soma3
    array = []
    array3 = []
    soma3 = 0
})