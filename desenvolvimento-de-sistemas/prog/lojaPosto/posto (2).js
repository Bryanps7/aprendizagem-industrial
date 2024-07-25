let respostaGas = document.getElementById('respostaGas')
let respostaAlc = document.getElementById('respostaAlc')

function gasolinaRes(){
    let gasolina = Number(document.getElementById('gasolina').value)
    let gasolinaPreco = 5.69

    let gasolinaValor = gasolina * gasolinaPreco
    console.log('valor: ' + gasolinaValor)
    respostaGas.innerHTML = 'valor: R$:' + gasolinaValor.toFixed(2)
}
function alcoolRes(){
    let alcool = Number(document.getElementById('alcool').value)
    let alcoolPreco = 5.51

    let alcoolValor = alcool * alcoolPreco
    console.log('valor: ' + alcoolValor)
    respostaAlc.innerHTML = 'valor: R$:' + alcoolValor.toFixed(2)
}