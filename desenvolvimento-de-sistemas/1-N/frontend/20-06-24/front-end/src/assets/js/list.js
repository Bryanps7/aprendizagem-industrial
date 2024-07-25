let listarProduto = document.getElementById('listarProduto')
let listarFabricante = document.getElementById('listarFabricante')
// let resLisProd = document.getElementById('resLisProd').value
let resLisFab = document.getElementById('resLisFab').value

console.log(listarFabricante)

listarFabricante.addEventListener('click', ()=> {
    // console.log('miguel')


    // fetch('http://localhost:8080/fabricante')
    // .then(respostaFab => respostaFab.json())
    // .then(dados => {
    //     resLisFab.innerHTML = dados
    // })
    // .catch((err) => console.error("Erro no servidor. o/", err))
})

// listarProduto.addEventListener('click', ()=>{

//     fetch('http://localhost:8080/produto')
//     .then(respostaBack => respostaBack.json())
//     .then(nome => {
//         resposta.innerHTML = respostaBack
//     })
//     .catch((err) =>
//         console.error("Erro no servidor. o/", err))
// })