let resposta = document.getElementById('resposta')
let verificar = document.getElementById('verificar')

verificar.addEventListener('click', ()=>{
    let nome = document.getElementById('nome').value
    let peso = Number(document.getElementById('peso').value)
    let altura = Number(document.getElementById('altura').value)

    const paciente = new Paciente(nome,peso,altura)

    let imc = paciente.calculaIMC()
    let resultado = paciente.verificaIMC()

    console.log("O cliente ",nome, " tem um IMC = ",imc.toFixed(2))
    console.log("A classificação do paciente",nome," é ", resultado)
    resposta.innerHTML = "O cliente " + nome + " tem um IMC = " + imc.toFixed(2) + "<br>"
    resposta.innerHTML = "A classificação do paciente "+nome+" é "+ resultado
})

