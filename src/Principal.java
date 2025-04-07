public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "Naruto";
        meuFilme.anoDeLancamento = 2006;
        meuFilme.avaliacao = 8.9;
        meuFilme.duracaoEmMinutos = 108;
        meuFilme.incluidoNoPlano = true;
        meuFilme.totalDeAvaliacoes = 50;

        meuFilme.exibeFichaTecnica();
    };
}
