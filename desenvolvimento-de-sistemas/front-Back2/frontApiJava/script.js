let teste = document.getElementById('teste')
let res = document.getElementById('res')
let procurador = document.getElementById('procurador')

teste.addEventListener('click', ()=>{
    fetch('http://localhost:8080/')
    .then(resposta => resposta.text())
    .then(dados => {
        res.innerHTML = dados
        res.style.fontSize = "1.4rem"
    })
    .catch((err)=> console.error("Servidor não responde"))
})

procurador.addEventListener('Click', ()=>{
    const codigo = Number(document.getElementById('codigo').value)

    fetch(`http://localhost:8080/usuarios/${codigo}`)
    .then(resposta => resposta.json())
    .then(dados =>{
        res.innerHTML = "Codigo: " + dados.id + "&emsp;" +
        "Nome: " + dados.nome + "&emsp;" +
        "Idade: " + dados.idade
    })
    .catch((err)=> console.error("Servidor não está funcionando"))
})