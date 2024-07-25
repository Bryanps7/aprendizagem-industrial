public class progClass {
    private String nome;
    private double preco;
    private double avaliacao;
    private int estoque;
    private String marca;

    public progClass() { }

    @Override
    public String toString() {
        return String.format("| Nome: %s \n" +
                             "  | Preço R$: %.2f \n" +
                             "  | Avaliação: %.2f \n" +
                             "  | Estoque: %d \n" +
                             "  | Marca: %s %n \n",
                            getNome(), getPreco(), getAvaliacao(), getEstoque(), getMarca());
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public int getEstoque() {
        return estoque;
    }

    public String getMarca() {
        return marca;
    }
}
