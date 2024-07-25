

let resposta = document.getElementById("resposta")
function contar(){
    let par = Number(document.getElementById('par').value)
    let contagem = 1

    if((par>0)&&(par<=20)){
        while(contagem <= par){
            if(contagem % 2 == 0){
                console.log(contagem)
                resposta.innerHTML += contagem + "<br>" + "<hr>"
            }
            contagem = contagem + 1
        }
    }else{
        console.log("Digite um número entre 1 e 20")
        resposta.innerHTML = "Digite um número entre 1 e 20"
    }
}