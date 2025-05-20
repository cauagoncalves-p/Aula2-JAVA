package br.java.aula;

import Exercicios.CalculosAP;

public class CalculadoraSalaRetangular {
    public static void main(String[] args) {
        CalculosAP cal = new CalculosAP();
        cal.setArea(10);
        cal.setPerimetro(5);

        System.out.println(cal.getCalcularPerimetro());
        System.out.println(cal.getCalcularArea());
    }
}
