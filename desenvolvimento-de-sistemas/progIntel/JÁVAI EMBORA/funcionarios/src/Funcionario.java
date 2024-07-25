public class Funcionario {
    private int codigo;
    private String nome;
    private String telefone;
    private double salarioBase;

    public Funcionario(){

    }

    public Funcionario(int codigo, String nome, String telefone, double salarioBase) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.salarioBase = salarioBase;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public double calcSalario(){
        return calcSalario();
    }
    @Override
    public String toString(){
        return String.format("| Nome: %s \n" +
                             "  | Código: %d \n" +
                             "  | Telefone: %s \n" +
                             "  | Salário Base: %.2f",
                            getNome(), getNome(), getTelefone(), getSalarioBase());
    }
}
