package br.java.aula;

import br.java.aula.screenmath.modelos.Aluno;
public class Alunos {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno1 = new Aluno();
        aluno.setAluno("Cauã");
        aluno.soma(5);
        aluno.soma(11);
        aluno.soma(15);
        System.out.println("Aluno: " +  aluno.getAluno());
        System.out.println("Média das notas: " + aluno.media());
        System.out.println();
        aluno1.setAluno("Pedro");
        aluno1.soma(7);
        aluno1.soma(9);
        aluno1.soma(18);
        System.out.println("Aluno: " +  aluno1.getAluno());
        System.out.println("Média das notas: " + aluno1.media());
    }
}

