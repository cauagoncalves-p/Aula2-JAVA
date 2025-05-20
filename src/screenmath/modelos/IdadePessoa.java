package screenmath.modelos;

public class IdadePessoa {
    private int idade;
    private String nome;


    public  void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public int getIdade()
    {
        return idade;
    }

    public void verificarIdade(int idade)
    {
        if (idade > 18){
            System.out.println("Você é maior de idade");
        }
        else{
        System.out.println("Você é de menor");
        }
    }
}
