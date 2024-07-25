class Paciente{
    constructor(nome,peso,altura){
        this.nome = nome
        this.peso = peso
        this.altura = altura
    }

    calculaIMC(){
        let resultado = 0
        resultado = (this.peso) / (this.altura * this.altura)
    
        return resultado
    }

    verificaIMC(){
        let imc = this.calculaIMC()
        if(imc < 18.5){
            return "Abaixo do peso"
        }else if((imc >= 18.5)&&(imc < 25)){
            return "Peso Ideal"
        }else if((imc >= 25)&&(imc < 30)){
            return "Levemente acima do peso"
        }else if((imc >= 30)&&(imc < 35)){
            return "Obesidade Leve - Grau I"
        }else if((imc >= 35)&&(imc <40)){
            return "Obesidade Severa - Grau II"
        }else if(imc >= 40){
            return "Obesidade Mórbida - Grau III"
        }else{
            return "Não foi possivel determinar o seu IMC"
        }
    }
}