let resposta = document.getElementById("resposta")
let botao = document.getElementById("botao")
let comprimento = document.getElementById('comprimento')
let altura = document.getElementById('altura')
let arestaH = document.getElementById('arestaH')
let raio = document.getElementById('raio')

botao.addEventListener("click",()=>{
    let select = document.getElementById("select").value
    const Calcular = new Calculo(comprimento,altura,arestaH,raio)
})