let gravar =document.getElementById('gravar')

gravar.addEventListener('click', ()=>{
    let nome = document.getElementById('nome').value    
    let marca = document.getElementById('marca').value
    let qtde = Number(document.getElementById('qtde').value)
    let validade = document.getElementById('validade').value
    let horaValid = document.getElementById('horaValid').value
    const valores = {
        nome: nome,
        marca: marca,
        quantidade: quantidade,
        data: validade,
        hora: horaValid
    }   
    
    let dados = {
        nome,
        marca,
        qtde,
        validade,
        horaValid
    }

    
    console.log(dados)
})
