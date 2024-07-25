let resposta1 = document.getElementById('resposta1')
let resposta2 = document.getElementById('resposta2')
let adiciona = document.getElementById('adiciona')
let somar = document.getElementById('somar')
 


let total = []
let par = []
let somaPar = 0

adiciona.addEventListener('click',()=>{
    let num = Number(document.getElementById('num').value)
    total.push(num)
    console.log(total)
    resposta1.innerHTML = '[ ' + total + ' ]'
})
somar.addEventListener('click',()=>{
    somaPar = 0
    for(let i = 0;i<total.length;i++){
        if(total[i] % 2 == 0){
            par.push(total[i])
        }
    }
    for(let i = 0;i<par.length;i++){
        somaPar = somaPar + par[i]
    }
    console.log('soma par = ' + somaPar)
    resposta2.innerHTML = "A soma dos números pares é: " + somaPar
    total = []
    par = []
})