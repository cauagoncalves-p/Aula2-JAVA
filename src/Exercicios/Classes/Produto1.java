package Exercicios.Classes;

public class Produto1 {
    private String Nome;
    private double Preco;

    public Produto1(double preco, String nome) {
        Preco = preco;
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }


    public double getPreco() {
        return Preco;
    }


}
