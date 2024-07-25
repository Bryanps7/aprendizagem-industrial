
function calcular(){
    let resposta = document.getElementById('resposta')

    let bermuda = Number(document.getElementById('bermuda').value)
    let camisa = Number(document.getElementById('camisa').value)
    let tenis = Number(document.getElementById('tenis').value)

    console.log(bermuda,camisa,tenis)

    let precoBermuda = 35.00
    let precoCamisa = 40.00
    let precoTenis = 175.00

    let descBermuda = 0.0
    let descCamisa = 0.0
    let descTenis = 0.0
    if(bermuda>3){
        descBermuda = ( (bermuda*precoBermuda) * 0.1)
        console.log('valor da bermuda com desconto: ' + descBermuda)
    }else if((bermuda<4)&&(bermuda>0)){
        console.log('Valor da bermuda: ' + bermuda*precoBermuda)
    }

    if(camisa>3){
        descCamisa = ( (camisa*precoCamisa) * 0.1)
        console.log('valor da camisa com desconto: ' + descCamisa)
    }else if((camisa<4)&&(camisa>0)){
        console.log('Valor da camisa: ' + camisa*precoCamisa)
    }

    if(tenis>3){
        descTenis = ( (tenis*precoTenis) * 0.1)
        console.log('valor do tênis com desconto: ' + descTenis)
    }else if((tenis<4)&&(tenis>0)){
        console.log('Valor do tênis: ' + tenis*precoTenis)
    }



    let custo = (bermuda*precoBermuda) + (camisa*precoCamisa) + (tenis*precoTenis) - descBermuda - descCamisa - descTenis
    
    console.log('seu valor final é: ' + custo)
    resposta.innerHTML = 'Seu valor final é: ' + custo
}