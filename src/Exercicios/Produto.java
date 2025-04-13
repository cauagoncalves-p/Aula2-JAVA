package Exercicios;

public class Produto implements  Vendavel{
    private String nome;
    private int quantidade;

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private  double Preco;

    @Override
    public double CalcularPrecoTotal() {
        return this.Preco * this.quantidade;
    }

    @Override
    public double AplicarDesconto() {
       if (CalcularPrecoTotal() > 500){
           return CalcularPrecoTotal() - CalcularPrecoTotal() * 0.1;
       }
       else {
            return CalcularPrecoTotal() - CalcularPrecoTotal() * 0.5;
       }
    }
}
