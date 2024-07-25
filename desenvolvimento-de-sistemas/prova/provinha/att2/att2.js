let resposta1 = document.getElementById('resposta1')
let resposta2 = document.getElementById('resposta2')
let adicionar = document.getElementById('adicionar')
let resultado = document.getElementById('resultado')

let total = []
let div3 = []
let div5 = []
let div35 = []

adicionar.addEventListener('click',()=>{
    let num = Number(document.getElementById('num').value)
    total.push(num)
    console.log("total: " + total)
    resposta1.innerHTML = "[ "+total+" ]"
})

resultado.addEventListener('click',()=>{
    div3 = []
    div5 = []
    div35 = []
    resposta2.innerHTML = ''
    for(let i = 0;i<total.length;i++){
        if(total[i] % 3 == 0){
            div3.push(total[i])
        }
    } console.log('Div3 = ' + div3)
    for(let i = 0;i<total.length;i++){
        if(total[i] % 5 == 0){
            div5.push(total[i])
        }
    } console.log('Div5 = ' + div5)
    for(let i = 0;i<total.length;i++){
        if(total[i] % 3 == 0){
            if(total[i] % 5 == 0){
                div35.push(total[i])
            }
        }
    } console.log('Div 3 e 5 = ' + div35)
    resposta2.innerHTML += 'Divisivel por 3: '+div3+'<br>'
    resposta2.innerHTML += 'Divisivel por 5: '+div5+'<br>'
    resposta2.innerHTML += 'Divisivel por 3 e 5: '+div35
    total = []
})