package Exercicios.Classes;

public class Animal {
    private String Nome;
    private int Idade;

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    @Override
    public String toString() {
        return this.Nome;
    }
}
