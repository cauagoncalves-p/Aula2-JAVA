import br.java.screenmath.calculos.calculadoraDeTempo;
import br.java.screenmath.modelos.Filme;
import br.java.screenmath.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Naruto");;
        meuFilme.setAnoDeLancamento(2003);
        meuFilme.setDuracaoEmMinutos(108);;
        meuFilme.setIncluidoNoPlano(true);;
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(15);
        meuFilme.avalia(20);
        meuFilme.avalia(14);
        System.out.println(meuFilme.getSomaAvaliacao());

        System.out.println(meuFilme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("Naruto");
        serie.setAnoDeLancamento(2006);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setMinutosEpisodios(20);
        serie.setMinutosTemporadas(260);
        System.out.println("Duração para maratonar naruto: " + serie.getDuracaoEmMinutos());


        calculadoraDeTempo calc = new calculadoraDeTempo();
        calc.inclui(meuFilme);
        calc.inclui(serie);
        System.out.println(calc.getTempoTotal());
    };
}
