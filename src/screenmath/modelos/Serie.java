package screenmath.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int minutosTemporadas;
    private int minutosEpisodios;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public int getMinutosEpisodios() {
        return minutosEpisodios;
    }

    public void setMinutosEpisodios(int minutosEpisodios) {
        this.minutosEpisodios = minutosEpisodios;
    }

    public int getMinutosTemporadas() {
        return minutosTemporadas;
    }

    public void setMinutosTemporadas(int minutosTemporadas) {
        this.minutosTemporadas = minutosTemporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * minutosTemporadas * minutosEpisodios ;
    }

}