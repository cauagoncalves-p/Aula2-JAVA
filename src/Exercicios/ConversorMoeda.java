package Exercicios;

public class ConversorMoeda implements ConversaoFinanceira {
    private double valor = 15;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double converterDollarPraReal() {
        return this.valor /= 5;
    }
}
