package POO.Produto;

public class produto {

    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public produto(String name, double preco, int quantidade) {
        this.nome = name;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public double totalEmEstoque() {
        return preco * quantidade;
    }

    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome
            + ", $ "
            + String.format("%.2f", preco)
            + ", "
            + quantidade
            + " unidades, Total: $ "
            + String.format("%.2f", totalEmEstoque());
    }
}
