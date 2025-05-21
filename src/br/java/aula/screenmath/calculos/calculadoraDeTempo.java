package br.java.aula.screenmath.calculos;

import br.java.aula.screenmath.modelos.Filme;
import br.java.aula.screenmath.modelos.Serie;


public class calculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Filme filme){
        tempoTotal+= filme.getDuracaoEmMinutos();
    }

    public void inclui(Serie serie){
        tempoTotal+= serie.getDuracaoEmMinutos();
    }
}

