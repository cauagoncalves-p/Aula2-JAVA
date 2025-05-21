package br.java.aula.principal;
import br.java.aula.screenmath.modelos.Filme;
import br.java.aula.screenmath.modelos.Serie;
import br.java.aula.screenmath.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meufilme = new Filme("Naruto", 2006);
        meufilme.avalia(10);
        var filmeDoPaulo = new Filme("Harry Potter",2005);
        filmeDoPaulo.avalia(9);
        Serie serie = new Serie("Naruto",2006);
        serie.avalia(8);

        ArrayList<Titulo> Lista = new ArrayList<>();

        Lista.add(filmeDoPaulo);
        Lista.add(meufilme);
        Lista.add(serie);

        for ( Titulo item : Lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 4){
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }

    }
}
