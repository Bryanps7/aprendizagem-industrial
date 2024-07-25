let resposta = document.getElementById('resposta')
let adicionar = document.getElementById('adicionar')
let calcular = document.getElementById('calcular')
let mult = []
let valorTotal = Number(document.getElementById('valorTotal'))

adicionar.addEventListener('click',()=>{
    let item = document.getElementById('item').value
    let qtd = Number(document.getElementById('qtd').value)
    let itens = ["hamburguer","suco","chocolate"]
    let valores = [16, 6, 4]
    for(let i=0; i < itens.length;i++){
        if(item == itens[i]){
            mult=(qtd*valores[i])
        }
    }
    console.log(mult)
    resposta.innerHTML += "<hr>"
    resposta.innerHTML += "pedido - " + item + "<br>" + "Quantidade - " + qtd + "<br>" + "valor - " + mult
})
calcular.addEventListener('click',()=>{
    for(i=0; i < mult.length;i++){
        console.log("radiante")
        valorTotal = mult[i] + valorTotal
    }
    console.log(valorTotal)
    resposta.innerHTML = "Valor total é: " + valorTotal
})