package br.java.screenmath.modelos;
import br.java.screenmath.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String Diretor;

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String diretor) {
        Diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
