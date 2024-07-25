public class estoque {
    private int id;
    private String nomeProduto;
    private int quantidadeProduto;

    public estoque(){

    }
    public estoque(int id, String nomeProduto, int quantidadeProduto) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public int adicionarEstoque(int valor){
        return this.quantidadeProduto += valor;
    }
    public int baixarEstoque(int valor){
        return this.quantidadeProduto -= valor;
    }
    public int getId() {
        return id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    // Melhorar o toString
    @Override
    public String toString() {
        return String.format(" Estoque | "+
                " Código do produto %d "+
                " Nome do produto %s "+
                " Quantidade do produto %d |",
                getId(), getNomeProduto(), getQuantidadeProduto());
    }
}

