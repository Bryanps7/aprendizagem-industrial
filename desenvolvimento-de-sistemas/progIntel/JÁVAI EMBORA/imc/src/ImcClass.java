public class ImcClass {
    private String nome;
    private double peso;
    private double altura;

    public ImcClass(){

    }

    public ImcClass(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public double imcCalculo() {
        double imc;
        imc = this.peso / (this.altura * this.altura);
        return imc;
    }
    }

    @Override
    public String toString() {
        return String.format("Nome: %s " +
                " Peso: %.f " +
                " Altura: %.f "+
                " IMC: %.f ",
                nome, peso, altura, imcCalculo());
    }
}
