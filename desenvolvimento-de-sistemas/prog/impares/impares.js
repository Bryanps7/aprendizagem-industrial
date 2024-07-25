let resposta = document.getElementById('resposta')

function resultado(){
    let numero = Number(document.getElementById('numero').value)
    console.log("O número digitado foi: " + numero)
    let soma = 0

    if((numero < 1)||(numero > 20)){
        console.log("Número Inválido, digite novamente")
        resposta.innerHTML = "Número Inválido, digite novamente"
    }else{
        for(let i=1;i<=numero;i++){
            if(i % 2 == 1){
                soma = soma + i
            }
        }
        console.log("A soma é igual a: " + soma)
        resposta.innerHTML = "A soma é igual a: " + soma
    }

}