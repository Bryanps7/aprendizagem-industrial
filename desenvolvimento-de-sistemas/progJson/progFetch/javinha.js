let bairro = document.getElementById('bairro')
let cep = document.getElementById('cep')
let localidade = document.getElementById('localidade')
let logradouro = document.getElementById('logradouro')
let uf = document.getElementById('uf')
let cepao = document.getElementById('cepao')
let marcelo = document.getElementById('marcelo')
//API FETCH para buscar dados na web --> JSON
function sergio(){
    fetch("https://viacep.com.br/ws/88200000/json/") // endpoint ou rota
    .then(resposta => resposta.json())
    .then(dados => {
        console.log(dados)
        console.log(dados.bairro)
        console.log(dados.cep)
        console.log(dados.localidade)
        console.log(dados.logradouro)
        console.log(dados.uf)
    
        bairro.innerHTML = dados.bairro    
        cep.innerHTML = dados.cep
        localidade.innerHTML = dados.localidade
        logradouro.innerHTML = dados.logradouro
        uf.innerHTML = dados.uf
    })
    .catch(error => console.error(error))
}