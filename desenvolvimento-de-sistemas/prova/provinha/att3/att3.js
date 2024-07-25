let resposta = document.getElementById('resposta')
let resultado = document.getElementById('resultado')


let volP = 247.58
let futP = 179.57
let basP = 260.89 

function calc(x, y){
    let z = 0
    z = x * y
    return z
}

resultado.addEventListener('click',()=>{
    resposta.innerHTML = ''
    let vol = Number(document.getElementById('vol').value)
    let fut = Number(document.getElementById('fut').value)
    let bas = Number(document.getElementById('bas').value)

    let volC = calc(vol, volP)
    let futC = calc(fut, futP)
    let basC = calc(bas, basP)
    console.log("Total Volei: "+ volC.toFixed(2))
    console.log("Total Futebol: "+futC.toFixed(2))
    console.log("Total Basquete: "+basC.toFixed(2))
    let total = volC + futC + basC
    console.log("Antes do desconto: "+ total.toFixed(2))
    if(total > 550){
        let totalD = total / 7
        total = total - totalD
    }
    console.log("Depois do desconto: "+ total.toFixed(2))
    resposta.innerHTML += "<hr>"
    resposta.innerHTML += "Total Volei: "+ volC.toFixed(2) + "<br>" + "<hr>"
    resposta.innerHTML += "Total Futebol: "+futC.toFixed(2) + "<br>" + "<hr>"
    resposta.innerHTML += "Total Basquete: "+basC.toFixed(2) + "<br>" + "<hr>"
    resposta.innerHTML += "Total: "+ total.toFixed(2) + "<br>" + "<hr>"
})