let resposta = document.getElementById('resposta')
let resposta2 = document.getElementById('resposta2')

function resultado(){
    let numero = Number(document.getElementById('numero').value)

    console.log(numero * 0.0193367801)
    resposta.innerHTML = "A conversão é: " + numero * 0.0193367801
}
    function resultado2(){
    let numero2 = Number(document.getElementById('numero2').value)

    console.log(numero2 / 0.0193367801)
    resposta2.innerHTML = "A conversão é: " + numero2 / 0.0193367801
}
