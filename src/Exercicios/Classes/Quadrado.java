package Exercicios.Classes;

import Exercicios.Interfaces.Forma;

public class Quadrado implements Forma {
    int area;

    @Override
    public int calcularArea() {
        return area * area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
