package br.java.aula.principal;

import br.java.aula.screenmath.calculos.FiltroRecomendacao;
import br.java.aula.screenmath.calculos.calculadoraDeTempo;
import br.java.aula.screenmath.modelos.Episodio;
import br.java.aula.screenmath.modelos.Filme;
import br.java.aula.screenmath.modelos.Pessoa;
import br.java.aula.screenmath.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme;
        meuFilme = new Filme("Naruto",2003);
        meuFilme.setDuracaoEmMinutos(108);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(7);
        meuFilme.avalia(5);
        System.out.println(meuFilme.getSomaAvaliacao());

        System.out.println(meuFilme.pegaMedia());

        Serie serie = new Serie("Naruto",2006);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setMinutosEpisodios(20);
        serie.setMinutosTemporadas(260);
        System.out.println("Duração para maratonar naruto: " + serie.getDuracaoEmMinutos());

        calculadoraDeTempo calc = new calculadoraDeTempo();
        calc.inclui(meuFilme);
        calc.inclui(serie);
        System.out.println(calc.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtre(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtre(episodio);

        var filmeDoPaulo = new Filme("Harry Potter",2005);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Cauã");
        pessoa1.setIdade(18);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Pedro");
        pessoa2.setIdade(15);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Maria");
        pessoa3.setIdade(21);

        var listaDePessoa = new ArrayList<Pessoa>();
        listaDePessoa.add(pessoa1);
        listaDePessoa.add(pessoa2);
        listaDePessoa.add(pessoa3);
        System.out.println("Tamanho da lista: " + listaDePessoa.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoa.get(0).getNome());
        System.out.println(listaDePessoa.toString());
    };
}
