class Cilindro{
    constructor(altura, raio){
        this.altura = altura
        this.raio = raio
    }
    
    calcularVolume(){
        let volume = 0.0

        volume = (Math.PI * (this.raio * this.raio)) * this.altura
        return volume
    }
}

module.exports = Cilindro