public class hospedeClass {
    private int id;
    private String nome;
    private String telefone;
    private String email;
    private int diasMesAtual;
    private int diasAluguel;
    private double aluguel;
    private boolean desconto;

    public hospedeClass() {

    }

    public double calcularAluguel(double valorDiaria) {
        if(this.diasAluguel >= 90) {
            this.desconto = true;
        }
        if(!this.desconto) {
            this.aluguel = (this.diasMesAtual * valorDiaria)*0.95;
        }else{
            this.aluguel = this.diasMesAtual * valorDiaria;
        }
        return 0.0;
    }

    public String relatorioQuarto() {
        return "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDiasMesAtual() {
        return diasMesAtual;
    }

    public void setDiasMesAtual(int diasMesAtual) {
        this.diasMesAtual = diasMesAtual;
    }

    public int getDiasAluguel() {
        return diasAluguel;
    }

    public void setDiasAluguel(int diasAluguel) {
        this.diasAluguel = diasAluguel;
    }

    public double getAluguel() {
        return aluguel;
    }

    public void setAluguel(double aluguel) {
        this.aluguel = aluguel;
    }

    public boolean isDesconto() {
        return desconto;
    }

    public void setDesconto(boolean desconto) {
        this.desconto = desconto;
    }

    public String toString() {
        return String.format("");
    }
}