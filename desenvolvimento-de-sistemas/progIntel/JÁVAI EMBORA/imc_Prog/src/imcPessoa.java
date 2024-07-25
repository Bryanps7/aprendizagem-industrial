public class imcPessoa {
    private int id;
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private double imc;
    private String classIMC;

    public imcPessoa() {

    }

    public imcPessoa(int id, String nome, int idade, double peso, double altura) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void calcularImc() {
        this.imc = this.peso / (this.altura * this.altura);
    }

    public void ClassificarIMC() {
        double calImc = this.peso / (this.altura * this.altura);

        if((calImc >= 0)&&(calImc < 18.5)){
            this.classIMC = "Abaixo do Peso";
        }if((calImc >= 18.5)&&(calImc < 25.0)){
            this.classIMC = "Peso Ideal";
        }if((calImc >= 25.0)&&(calImc < 30.0)){
            this.classIMC = "Levemente Acima do peso";
        }if((calImc >= 30.0)&&(calImc < 35.0)){
            this.classIMC = "Obesidade grau I";
        }if((calImc >= 35.0)&&(calImc < 40.0)){
            this.classIMC = "Obesidade grau II";
        }if(calImc >= 40.0){
            this.classIMC = "Obesidade grau III";
        }
    }

    public String resultado(double imc) {
        return "";
    }

    public double MDIdade(int idade) {
        return 0.0;
    }

    public double MDPeso(double peso) {
        return 0.0;
    }

    public double MDAltura(double altura) {
        return 0.0;
    }

    public String relatorioPessoa(String nome) {
        return "";
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    public double getImc() {
        return imc;
    }
    public String getClassIMC(){
        return classIMC;
    }
}