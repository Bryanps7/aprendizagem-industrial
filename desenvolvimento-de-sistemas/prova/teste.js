let resposta = document.getElementById('resposta')
let resposta2 = document.getElementById('resposta2')
let resposta3 = document.getElementById('resposta3')
let encontrar = document.getElementById('encontrar')
let armazenar = document.getElementById('armazenar')

let valorTotal = []
let valorDiv5 = []
let valorDiv7 = []

armazenar.addEventListener('click', ()=>{
    let div7 = Number(document.getElementById('div7').value)

    valorTotal.push(div7)
    console.log(valorTotal)
    resposta.innerHTML = valorTotal
    valorDiv5 = []
    valorDiv7 = []
})

encontrar.addEventListener('click', ()=>{
    resposta2.innerHTML = ''
    for(let i=0;i<valorTotal.length;i++){
        if(valorTotal[i] % 7 == 0){
            valorDiv7.push(valorTotal[i])
        }
    }
    resposta2.innerHTML = valorDiv7
    valorDiv7 = []
})

div5.addEventListener('click', ()=>{
    resposta3.innerHTML = ''
    for(let i=0;i<valorTotal.length;i++){
        if(valorTotal[i] % 5 == 0){
            valorDiv5.push(valorTotal[i])
        }
    }
    resposta3.innerHTML = valorDiv5
    valorDiv5 = []
})