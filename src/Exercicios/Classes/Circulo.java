package Exercicios.Classes;

import Exercicios.Interfaces.Forma;

public class Circulo implements Forma {
   private int raio;

    @Override
    public int calcularArea() {
        return (int) Math.PI  *  raio * raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}
