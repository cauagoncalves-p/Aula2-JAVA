package br.java.aula.screenmath.modelos;

public class Produto {
    private String nome;
    private double preco;

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public double aplicarDesconto(double desconto)
    {
      return preco * (1 - (desconto / 100));
    }
}
