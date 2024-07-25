public class Livro {
    private int codigo;
    private String titulo;
    private int qntd;
    private double preco;

    public Livro(){

    }

    public Livro(int codigo, String titulo, int qntd, double preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.qntd = qntd;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getQntd() {
        return qntd;
    }

    public double getPreco() {
        return preco;
    }
    public int calcQuantidade(){
        return calcQuantidade();
    }
    public double mediaLivro(){
        return mediaLivro();
    }
    public double mediaPreco(){
        return mediaPreco();
    }
    @Override
    public String toString(){
        return String.format("| Titulo: %s \n" +
                             "  | Código: %d \n" +
                             "  | Quantidade: %d \n" +
                             "  | Preço: %.2f",
                            getTitulo(), getCodigo(), getQntd(),getPreco());
    }
}
