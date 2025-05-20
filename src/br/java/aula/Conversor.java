package br.java.aula;

import Exercicios.ConversorTemperaturaPadrao;

public class Conversor {
    public static void main(String[] args) {
      ConversorTemperaturaPadrao conver = new ConversorTemperaturaPadrao();
      conver.setNumero(10);
      System.out.println(conver.celsiusParaFahrenheit());
      System.out.println(conver.fahrenheitParaCelsius());
    }
}
