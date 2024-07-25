let logradouro = document.getElementById('logradouro')
let bairro = document.getElementById('bairro')
let localidade = document.getElementById('localidade')

let button = document.getElementById('button')

button.addEventListener('click', ()=>{
    let endereco = document.getElementById('endereco').value

    fetch("https://viacep.com.br/ws/"+endereco+"/json/")
    .then(resposta => resposta.json())
    .then(dados => {
        console.log(dados)

        logradouro.innerHTML = "Logradouro: "+ dados.logradouro+"<br>"
        bairro.innerHTML = "Bairro: "+ dados.bairro+"<br>"
        localidade.innerHTML = "Localidade: "+ dados.localidade+"<br>"

    })
    .catch(err => console.error("erro: ",err))
})