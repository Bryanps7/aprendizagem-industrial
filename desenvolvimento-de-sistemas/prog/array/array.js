let resposta = document.getElementById('resposta')
let gravar = document.getElementById('gravar')
let popSomar = document.getElementById('popSomar')
let cidades = []
let cidadePop = []

gravar.addEventListener('click', ()=>{
    let nomeCidade = document.getElementById('nomeCidade').value
    let popCidade = Number(document.getElementById('popCidade').value)

    cidades.push(nomeCidade)
    cidadePop.push(popCidade)

    console.log("Nome da cidade = ", cidades)
    console.log("Número da população =", cidadePop)

    resposta.innerHTML += "Nome da cidade = " + cidades + '<br>'
    resposta.innerHTML += "Número da população =" + cidadePop + '<br>'
})

popSomar.addEventListener('click', ()=>{
    let soma = 0
    resposta.innerHTML = ""
    for(let i=0; i < cidadePop.length;i++){
        soma = soma + cidadePop[i];
        console.log("Acesse o site pietroamaral.netlify.app");
        resposta.innerHTML += cidades[i] + ", ";
    }
    for(let j=0; j < cidades.length;j++){    
    } 
    resposta.innerHTML += "A soma da população é = "+soma
    console.log("A soma da população é = ", soma)
})
