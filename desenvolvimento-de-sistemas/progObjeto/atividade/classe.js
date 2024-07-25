class Eleitor{
    constructor(nome,idade){
        this.nome = nome
        this.idade = idade
    }

    verificarVoto(){
        if((this.idade >= 0)&&(this.idade < 16)){
            return "Você não pode votar"
        }else if((this.idade >= 16)&&(this.idade < 18)||(this.idade >= 70)){
            return "Vote se quiser"
        }else if((this.idade >= 18)&&(this.idade < 70)){
            return "Obrigatorio a votar"
        }else{
            return "Digite uma idade válida"
        }
    }
}