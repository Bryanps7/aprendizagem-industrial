class Calculo{
    constructor(comprimento,altura,arestaH,raio){
        this.comprimento = comprimento
        this.altura = altura
        this.arestaH = arestaH
        this.raio = raio
    }
    // Bryan
    calculoPrisma(){
        let calc = (this.comprimento * this.comprimento) * (this.altura)
        return calc.toFixed(2)
    }
    // Bryan
    calculoCilindro(){
        let calc = (3.14 * (this.raio^2)) * (this.altura)
        return calc.toFixed(2)
    }
    // Julian
    calculoEsfera(){

    }
    // Vitor
    calculoCone(){

    }
    // Vitor
    calculoPiramide(){

    }
}