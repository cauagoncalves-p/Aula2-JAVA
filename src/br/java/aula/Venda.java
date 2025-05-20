package br.java.aula;

import Exercicios.Produto;
import Exercicios.Servico;

public class Venda {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Video Game");
        produto.setPreco(100);
        produto.setQuantidade(3);

        System.out.println(produto.CalcularPrecoTotal());
        System.out.println(produto.AplicarDesconto() );

        Servico servico = new Servico();
        servico.setTempoMinutos(60);
        System.out.println(servico.CalcularPrecoTotal());
        System.out.println(servico.AplicarDesconto());

    }
}
