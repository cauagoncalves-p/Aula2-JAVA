package screenmath.modelos;
import screenmath.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String Diretor;

    public Filme(String nome,int anoDeLancamento) {
       super(nome,anoDeLancamento);
       this.setNome(nome);
    }

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

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}


