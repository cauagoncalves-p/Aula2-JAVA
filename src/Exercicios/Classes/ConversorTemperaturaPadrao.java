package Exercicios.Classes;

import Exercicios.Interfaces.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    private double numero;

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    @Override
    public double celsiusParaFahrenheit() {
        double convertC =  (numero * 9 / 5 ) + 32 ;
        return convertC;
    }

    @Override
    public double fahrenheitParaCelsius() {
        double converF = (numero - 32 ) * 5/9;
        return converF;
    }
}
