let teste = document.getElementById('teste')
let respostaTeste = document.getElementById('respostaTeste')

teste.addEventListener('click', ()=>{
    let data = new Date('2022-07-23')
    respostaTeste.innerHTML = data
})