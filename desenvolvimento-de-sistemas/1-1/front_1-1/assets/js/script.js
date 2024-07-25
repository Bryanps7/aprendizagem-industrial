let res = document.getElementById('res')
let cadastrar = document.getElementById('cadastrar')
let consultar = document.getElementById('consultar')
let listar = document.getElementById('listar')

cadastrar.addEventListener('click', ()=>{
    let nome = document.getElementById('nome').value
    let cpf = document.getElementById('cpf').value

    const valores = {
        nome : nome,
        cpf : cpf
    }
 
    fetch('http://localhost:8080/doador',{
        method:"POST",
        headers:{"Content-Type":"application/json"},
        body: JSON.stringify(valores)

    })
    .then(resp => resp.json())
    .then(dados => {        
        console.log(dados);
        res.innerHTML = "Dados Cadastrados"
    })
    .catch((err)=> console.error(" Digite novamente!", err))
})


