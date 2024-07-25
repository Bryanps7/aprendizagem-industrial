let resposta = document.getElementById('resposta')
let resposta2 = document.getElementById('resposta2')

function resultado(){
    let numero = Number(document.getElementById('numero').value)

    console.log((numero * 9/5) + 32)
    resposta.innerHTML = "A conversão é: " + ((numero * 9/5) + 32) + "°"
}

    function resultado2(){
    let numero2 = Number(document.getElementById('numero2').value)
     
    console.log((numero2 - 32) * 5/9)
    resposta2.innerHTML = "A conversão é: " + ((numero2 - 32) * 5/9).toFixed(4) + "°" 
}
