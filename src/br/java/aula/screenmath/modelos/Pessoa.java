package br.java.aula.screenmath.modelos;

public class Pessoa {
    private String Nome;
    private int Idade;


    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    @Override
    public String toString() {
        return "Eu sou " + this.Nome + " e tenho " + this.Idade;
    }
}
