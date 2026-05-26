package sistemaestoque.src.model;

public class Produto {
     
    //props
    private String nome;
    private double preco;
    private int quantidade;

    //ctor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //getters e setters
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

    //method
    @Override
    public String toString() {
        return "\nNome: " + nome +
               "\nPreço: R$" + preco +
               "\nQuantidade: " + quantidade;
    }   
}
