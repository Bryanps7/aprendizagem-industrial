let resposta = document.getElementById('resposta')
let calcula = document.getElementById('calcula')

calcula.addEventListener('click', ()=>{
    let base = Number(document.getElementById('base').value)
    let altura = Number(document.getElementById('altura').value)


    const retag = new Retangulo(base, altura)
    let hipT = 0
    let areaQ = 0
    let areaR = 0
    if(base === altura){
        areaQ = retag.areaQ()
    }else{
        areaR = retag.areaR()
        hipT = hipo(base,altura)
        console.log(hipT)
    }

    
})

function raiz(num){
    let valRaiz = Math.sqrt(num)
    return valRaiz
}

function hipo(base,altura){
    let hip = raiz((base * base) + (altura * altura))
    return hip
}

