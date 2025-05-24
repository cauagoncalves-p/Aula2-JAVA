package Exercicios.Classes;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.getNome();
    }

    @Override
    public int compareTo(Titulo nome) {return this.getNome().compareTo(nome.getNome());}
}
