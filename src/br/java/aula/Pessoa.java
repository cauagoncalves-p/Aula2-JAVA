package br.java.aula;

import screenmath.modelos.IdadePessoa;

public class Pessoa {
    public static void main(String[] args) {
        IdadePessoa IdadePessoa = new IdadePessoa();
        IdadePessoa.setNome("caio");
        IdadePessoa.setIdade(19);
        System.out.println(IdadePessoa.getIdade());
        System.out.println(IdadePessoa.getNome());
        IdadePessoa.verificarIdade(IdadePessoa.getIdade());
    }
}

