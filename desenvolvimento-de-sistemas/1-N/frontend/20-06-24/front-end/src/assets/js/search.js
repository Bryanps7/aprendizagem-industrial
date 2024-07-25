let buscarProduto = document.getElementById('buscarProduto')
let buscarFabricante = document.getElementById('buscarFabricante')
let resBusFab = document.getElementById('resBusFab')
let resBusProd = document.getElementById('resBusProd')

buscarFabricante.addEventListener('click', ()=>{
    let codFab = Number(document.getElementById('codFab').value)

    fetch(`http://localhost:8080/fabricante/${codFab}`)
    .then(respostaFab => respostaFab.json())
    .then(dados => {
        console.log(dados)
        codFab.value = dados.codFab
        nomeFab.value = dados.nomeFab

        resBusFab.innerHTML = "código: "+dados.codFab+"<br> Nome: "+dados.nomeFab
    })
})

// buscarProduto.addEventListener('click', ()=>{
//     fetch(`http://localhost:8080/produtos/${nome}`)
//     .then(resposta => resposta.json())
//     .then(dados => {
//         nome.value = dados.nome
//         quantidade.value = dados.quantidade
//     })
//     .catch((err)=> console.error("Erro de servidor.",err))
// })