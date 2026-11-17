public class Produto {

    private String nome, codigo; 
    private double preco;

    public String getNome() {
    return nome;
    }

     public String getCodigo() {
     return codigo;
    }

    public double getPreco() {
    return preco;
    }

    public Produto(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public void mostrarProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Código " + codigo);
        System.out.println("Preço: " + preco);
    }



    

}