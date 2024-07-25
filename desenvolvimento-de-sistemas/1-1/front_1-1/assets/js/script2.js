let res = document.getElementById('res')
let consultar = document.getElementById('consultar')

consultar.addEventListener('click', ()=>{
    let codigo = Number(document.getElementById('codDoador').value)

    const valores = {
        nome : nome,
        cpf : cpf
    }
 
    fetch(`http://localhost:8080/doador/${codigo}`)
    .then(resp => resp.json())
    .then(dados =>{
            res.innerHTML = "Nome: " + dados.nome + "&emsp;" +
                            "CPF: " + dados.cpf
        })
        .catch((err)=> console.error("servidor não responde!",err))
})