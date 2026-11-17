public class Item {
    private Produto produto;
    private int quantidade;
    private double custo;

    public void comprar(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.custo = produto.getPreco() * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getCusto() {
        return custo;
    }
}