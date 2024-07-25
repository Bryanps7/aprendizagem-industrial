let resposta = document.getElementById('resposta')

function resultado(){
    let numero = Number(document.getElementById('numero').value)

    if((numero<10)||(numero>30)){
        console.log("Insira outro valor")
        resposta.innerHTML = "Insira outro valor"    
    }else{
        console.log("O triplo do valor é: " + numero * 3)
        resposta.innerHTML = "O triplo do valor é: " + numero * 3
    }
}