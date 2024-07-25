let buscaCEP = document.getElementById('buscarCEP')

buscaCEP.addEventListener('click', ()=>{
    let cepDoador = document.getElementById('cepDoador').value

    console.log("CEP doador: ", cepDoador)

    fetch('https://viacep.com.br/ws/'+cepDoador+'/json/')
    .then(resp => resp.json())
    .then(dados => console.log(dados))
    .catch((err)=> console.error("Cep não encontrado! Digite novamente!", err))
})