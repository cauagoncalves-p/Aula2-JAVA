package Exercicios;

import Exercicios.Classes.*;
import Exercicios.Interfaces.Forma;
import br.java.aula.screenmath.modelos.Titulo;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
    Produto1 prod1 = new Produto1(100, "Maça");
    Produto1 prod2 = new Produto1(50, "Pera");
    Produto1 prod3 = new Produto1(30, "Banana");
    var produtos = new ArrayList<Produto1>();

    //produtos.add(prod1);
    //produtos.add(prod2);
    //produtos.add(prod3);

    //double soma = 0;
     //    for (Produto1 item : produtos){
      //      soma += item.getPreco();
      //   }

       // System.out.println("A média dos preços é " + soma/ produtos.size() );

        //Circulo circulo = new Circulo();
        //circulo.setRaio(5);

        //Quadrado quadrado = new Quadrado();
        //quadrado.setArea(10);

        //ArrayList<Forma>  formas = new ArrayList<>();
        //formas.add(circulo);
        //formas.add(quadrado);

        //for (Forma f : formas){
        //    System.out.println("Area: " + f.calcularArea());
        //}

        COntaBancaria conta1 = new COntaBancaria();
        conta1.setNumeroConta(1);
        conta1.setSaldo(100);

        var conta2 = new COntaBancaria();
        conta2.setNumeroConta(2);
        conta2.setSaldo(200);

        var conta3 = new COntaBancaria();
        conta3.setNumeroConta(3);
        conta3.setSaldo(150);

        var conta4 = new COntaBancaria();
        conta4.setNumeroConta(4);
        conta4.setSaldo(350);

        ArrayList<COntaBancaria> conta = new ArrayList<>();

        conta.add(conta1);
        conta.add(conta2);
        conta.add(conta3);
        conta.add(conta4);

        double maiorSaldo = 0;
        for (COntaBancaria cnt : conta) {
            if (cnt.getSaldo() > maiorSaldo){
                maiorSaldo = cnt.getSaldo();
            }
        }

        System.out.printf(String.valueOf(maiorSaldo));
    }
}
