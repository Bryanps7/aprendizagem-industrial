public class coneClass {
    private double raio;
    private double altura;

    public coneClass(double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }
    public double calcularVolume(){
        double volume = 0.0;
        volume = Math.PI * (this.raio * this.raio) * this.altura / 3.0;
        return volume;
    }
}
