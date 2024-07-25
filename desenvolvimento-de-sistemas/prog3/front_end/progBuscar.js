let resposta = document.getElementById('resposta')
let consultar = document.getElementById('consultar')


consultar.addEventListener('click', ()=>{
    fetch("http://localhost:8080/usuario")
    .then(resposta => resposta.json())
    .then(dados => {
        console.log(dados)
        dados.forEach(valor => {
            resposta.innerHTML = valor.id + "<br>"
            resposta.innerHTML += valor.nome + "<br>"
            resposta.innerHTML += valor.idade
        })
    })    
    .catch((err) => console.error("Erros: ",err))
})