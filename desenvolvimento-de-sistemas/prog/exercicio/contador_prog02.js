let resposta = document.getElementById('resposta')

function contar(){
    let par = Number(document.getElementById('par'.value))
    let contagem = 0
    resposta.innerHTML = ''
    do{
        contagem +=1 

        console.log("VALOR = ", contagem)
        resposta.innerHTML += "valor = " + contagem + "<br>"
    }while(contagem<=num)
}