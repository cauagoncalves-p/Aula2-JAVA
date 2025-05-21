package br.java.aula.screenmath.calculos;

public class FiltroRecomendacao {
    public void filtre(Classificavel classificavel)
    {
        if (classificavel.getClassificacao() > 4){
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() > 2) {
            System.out.println("Muito avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista pra assistir depois");
        }
    }
}
