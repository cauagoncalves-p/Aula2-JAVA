package br.java.aula;

import Exercicios.Classes.ConversorMoeda;

public class ConverterMoeda {
    public static void main(String[] args) {
        ConversorMoeda moeda = new ConversorMoeda();
        moeda.setValor(20);
        System.out.println(moeda.converterDollarPraReal());
    }
}
