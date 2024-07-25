let buscaCEP = document.getElementById('buscaCEP')
let gravar = document.getElementById('gravar')

buscaCEP.addEventListener('click', ()=>{
    let cepDoador = document.getElementById('cepDoador').value
    console.log("cep doador = ", cepDoador)

    // buscando os objetos do formulário relacionado ao cep
    let logradouroDoador = document.getElementById('logradouroDoador')
    let bairroDoador = document.getElementById('bairroDoador')
    let localidadeDoador = document.getElementById('localidadeDoador')
    let ufDoador = document.getElementById('ufDoador')
    // ---------------------------------------------------
    fetch('https://viacep.com.br/ws/'+cepDoador+'/json/')
    .then(resp => resp.json())
    .then(dados => {        
        // ----- incluindo o valor pesquisado na api VIACEP
        logradouroDoador.value = dados.logradouro
        bairroDoador.value = dados.bairro
        localidadeDoador.value = dados.localidade
        ufDoador.value = dados.uf
    })
    .catch((err)=> console.error("Cep não encontrado! Digite novamente!", err))

})

gravar.addEventListener('click', ()=>{
    let nomeDoador = document.getElementById('nomeDoador').value
    let cpfDoador = document.getElementById('cpfDoador').value
    let telefoneDoador = document.getElementById('telefoneDoador').value
    let emailDoador = document.getElementById('emailDoador').value
    let cepDoador = document.getElementById('cepDoador').value
    let logradouroDoador = document.getElementById('logradouroDoador').value
    let numeroDoador = document.getElementById('numeroDoador').value
    let complementoDoador = document.getElementById('complementoDoador').value
    let bairroDoador = document.getElementById('bairroDoador').value
    let localidadeDoador = document.getElementById('localidadeDoador').value
    let ufDoador = document.getElementById('ufDoador').value

    console.log("cidade = ",localidadeDoador)
    console.log("complemento = ",complementoDoador)
    console.log("numero = ",numeroDoador)

    // fetch para backend

})

