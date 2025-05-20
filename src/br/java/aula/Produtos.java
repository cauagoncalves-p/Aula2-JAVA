package br.java.aula;

import screenmath.modelos.Produto;
public class Produtos {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Maça");
        produto.setPreco(100);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Desconto de: " + produto.aplicarDesconto(0));
    }
}
