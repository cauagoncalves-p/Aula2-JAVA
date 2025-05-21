package Exercicios.Classes;

import Exercicios.Interfaces.CalculoGeometrico;

public class CalculosAP implements CalculoGeometrico {
    private double Area;
    private double Perimetro;

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public double getPerimetro() {
        return Perimetro;
    }

    public void setPerimetro(double perimetro) {
        Perimetro = perimetro;
    }

    @Override
    public double getCalcularArea() {
        return getArea() * getPerimetro();
    }

    @Override
    public double getCalcularPerimetro() {
        return (getPerimetro() * 2 ) + (getArea() * 2);
    }
}
