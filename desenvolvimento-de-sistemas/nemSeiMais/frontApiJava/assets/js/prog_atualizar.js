let res_atualizar = document.getElementById('res_atualizar')
let atualizar = document.getElementById('atualizar')

atualizar.addEventListener('click', ()=>{
    const id = Number(document.getElementById('id').value)
    const nome = document.getElementById('nome').value
    const idade = Number(document.getElementById('idade').value)

    const valores = {
        idade: idade,
        nome: nome
    }

    fetch(`http://localhost:8080/usuario/${id}`,{
        method: "PUT",
        headers: { "Content-Type": "application/json"},
        body: JSON.stringify(valores)
    })
    .then(resposta => resposta.json())
    .then(dados =>{
        console.log(dados)
        res_atualizar.innerHTML = "Código: " + dados.id + "&emsp;" +
                                  "Nome: " + dados.nome + "&emsp;" +
                                  "Idade: " + dados.idade + '<br>'

        res_atualizar.innerHTML = 

        res_atualizar.style.color = 'cornflowerblue'
        res_atualizar.style.fontSize = '1.5rem'
    })
    .catch((err) => {
        console.error(`erro ao atualizar os dados ${err}`)
    })
})