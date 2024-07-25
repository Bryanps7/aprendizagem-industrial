let resposta = document.getElementById('resposta')
let cadastra = document.getElementById('cadastra')
let dados = []

cadastra.addEventListener('click', ()=>{
    let nome = document.getElementById('nome').value
    let sobrenome = document.getElementById('sobrenome').value
    let idade = Number(document.getElementById('idade').value)
    let peso = Number(document.getElementById('peso').value)

    let c1 = new Cliente(nome,sobrenome,idade,peso)
    dados.push(c1)
    console.log(dados)
    // let c1 = new Cliente()
    // c1.nome = nome
    // c1.sobrenome = sobrenome
    // c1.idade = idade
    // c1.peso = peso

    resposta.innerHTML += `Dados do cliente: ${c1.nome} <br> `
    resposta.innerHTML += `Dados do cliente: ${c1.sobrenome} <br> `
    resposta.innerHTML += `Dados do cliente: ${c1.idade} <br> `
    resposta.innerHTML += `Dados do cliente: ${c1.peso} <br> `
    

})