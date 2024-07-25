let resposta = document.getElementById('resposta')

function semana(){
    let dia = Number(document.getElementById('dia').value)
    let diaRes = 0
    switch(dia){
        case 1:
            diaRes = 'Domingo'
        break;
        case 2:
            diaRes = 'Segunda-Feira'
        break;
        case 3:
            diaRes = 'Terça-Feira'
        break;
        case 4:
            diaRes = 'Quarta-Feira'
        break;
        case 5:
            diaRes = 'Quinta-Feira'
        break;
        case 6:
            diaRes = 'Sexta-Feira'
        break;
        case 7:
            diaRes = 'Sábado'
        break;
        default:
            diaRes = 'Inválido, insira outro valor.'
        break;
    }
    if(dia=1,2,3,4,5,6,7){
        resposta.innerHTML = 'o dia da semana é: ' + diaRes
        console.log('o dia da semana é: ' + diaRes)
    }else{
        resposta.innerHTML = diaRes
        console.log(diaRes)
    }
}