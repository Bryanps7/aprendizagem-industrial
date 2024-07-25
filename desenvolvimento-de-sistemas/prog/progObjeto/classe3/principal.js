let resposta = document.getElementById('resposta')
let verificar = document.getElementById('verificar')

verificar.addEventListener('click', ()=>{
    let nome = document.getElementById('nome').value
    let idade = Number(document.getElementById('idade').value)


    const eleitor = new Eleitor(nome,idade)
    console.log(eleitor)

    let resultado = eleitor.verificarVoto()
    console.log(resultado)
})

