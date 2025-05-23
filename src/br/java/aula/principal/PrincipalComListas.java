package br.java.aula.principal;
import br.java.aula.screenmath.modelos.Filme;
import br.java.aula.screenmath.modelos.Serie;
import br.java.aula.screenmath.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meufilme = new Filme("Naruto", 2006);
        meufilme.avalia(10);
        var filmeDoPaulo = new Filme("Harry Potter", 2005);
        filmeDoPaulo.avalia(9);
        Serie serie = new Serie("Amor", 2006);
        serie.avalia(8);

        List<Titulo> Lista = new ArrayList<>();


        Lista.add(filmeDoPaulo);
        Lista.add(meufilme);
        Lista.add(serie);

        for (Titulo item : Lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 4) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Caio castro");
        buscaPorArtista.add("Jaqueline");
        buscaPorArtista.add("Maycon");
        buscaPorArtista.add("Enzo");

        System.out.println("Busca por artista: " + buscaPorArtista);

        // Trago por ordem alfabetica
        Collections.sort(buscaPorArtista);
        System.out.println("Busca por artista: " + buscaPorArtista);

        System.out.println("Litsa de titutos" + Lista);
        Collections.sort(Lista);
        System.out.println("Lista de titulos ordenados" + Lista);

        Lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(Lista);


        //Criando um objeto da classe HashMap que implementa a interface Map
        Map<String, Integer> usandoHashMap = new HashMap<>();

        // Adicionando pares chave-valor
        usandoHashMap.put("Gatos", 1);
        usandoHashMap.put("Cachorros", 2);
        usandoHashMap.put("Roedores", 3);

        // Acessando um valor através de uma chave
        int valor = usandoHashMap.get("Cachorros");
        System.out.println("Valor da chave Cachorros: " + valor);

        // Removendo um par chave-valor
        usandoHashMap.remove("Gatos");

        // Iterando sobre as chaves
        for (String chave : usandoHashMap.keySet()) {
            System.out.println("Chave: " + chave);
            System.out.println("Valor: " + usandoHashMap.get(chave));
        }
    }
}
