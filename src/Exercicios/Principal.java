package Exercicios;

import Exercicios.Classes.Animal;
import Exercicios.Classes.Cachorro;
import Exercicios.Classes.Produto1;
import br.java.aula.screenmath.modelos.Titulo;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
    Produto1 prod1 = new Produto1(100, "Maça");
    Produto1 prod2 = new Produto1(50, "Pera");
    Produto1 prod3 = new Produto1(30, "Banana");
    var produtos = new ArrayList<Produto1>();

    produtos.add(prod1);
    produtos.add(prod2);
    produtos.add(prod3);

    double soma = 0;
         for (Produto1 item : produtos){
            soma += item.getPreco();
         }

        System.out.println("A média dos preços é " + soma/ produtos.size() );
    }
}
