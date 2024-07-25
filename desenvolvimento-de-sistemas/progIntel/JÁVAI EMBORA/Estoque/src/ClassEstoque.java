public class ClassEstoque {
    private int id;
    private String nome;
    private String marca;
    private int quantidade;

    public ClassEstoque(){ }

    public ClassEstoque(int id, String nome, String marca, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return String.format("| Nome: %s \n" +
                             "  | Código: %d \n" +
                             "  | Marca: %s \n" +
                             "  | Quantidade: %d \n",
                                getNome(),getId(),getMarca(),getQuantidade());
    }
}
