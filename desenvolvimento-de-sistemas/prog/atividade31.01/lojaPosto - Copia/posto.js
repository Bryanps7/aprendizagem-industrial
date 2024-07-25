let respostaGas = document.getElementById('respostaGas')
let respostaAlc = document.getElementById('respostaAlc')

function gasolinaRes(){
    let gasolina = Number(document.getElementById('gasolina').value)
    let gasolinaPreco = 5.69

    if(gasolina>25){
        custoGasolina = (gasolina*gasolinaPreco)*0.97
        console.log('descontão')
    }else{
        custoGasolina = gasolina*gasolinaPreco
    }
    console.log('valor: ' + custoGasolina)
    respostaGas.innerHTML = 'valor: R$:' + custoGasolina.toFixed(2)
}

function alcoolRes(){
    let alcool = Number(document.getElementById('alcool').value)
    let alcoolPreco = 5.51

    if(alcool>25){
        custoAlcool = (alcool*alcoolPreco)*0.97
        console.log('descontão')
    }else{
        custoAlcool = alcool*alcoolPreco
    }
    console.log('valor: ' + custoAlcool)
    respostaAlc.innerHTML = 'valor: R$:' + custoAlcool.toFixed(2)
}