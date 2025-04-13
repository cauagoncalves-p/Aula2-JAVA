package Exercicios;

public class Servico implements  Vendavel{
    private int tempoMinutos;
    private double precoServico;

    public int getTempoMinutos() {
        return tempoMinutos;
    }

    public void setTempoMinutos(int tempoMinutos) {
        this.tempoMinutos = tempoMinutos;
    }

    public double getPrecoServico() {
        return precoServico;
    }

    public void setPrecoServico(double precoServico) {
        this.precoServico = precoServico;
    }

    @Override
    public double CalcularPrecoTotal() {
        if (tempoMinutos > 180)
        {
            return precoServico = 200;
        }
        else {
            return precoServico = 100;
        }
    }

    @Override
    public double AplicarDesconto() {
        if (tempoMinutos == 60)
        {
            return CalcularPrecoTotal() -  CalcularPrecoTotal() * 0.2;
        }
        return 0;
    }
}
