package br.java.screenmath.modelos;

public class Aluno {
    private String aluno;
    private double Nota;
    private double media;

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getAluno()
    {
        return aluno;
    }


    public void soma(double nota)
    {
        this.Nota += nota;
        media++;
    }

    public double media()
    {
       return Nota / media;
    }

    public static class contaBancaria {
        private int numeroConta;
        private double saldo;
        private String titular;

        public double getSaldo() {
            return saldo;
        }

        public int getNumeroConta() {
            return numeroConta;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public void setNumeroConta(int numeroConta) {
            this.numeroConta = numeroConta;
        }

        public void setTitular(String titular)
        {
            this.titular = titular;
        }

        public String getTitular()
        {
            return titular;
        }
    }
}

