package ExercicioBasico.java;

public class Pessoa {

    private String nome;
    private int idade;

    public void setNome (String n){
        nome = n;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int age){
        if (age < 0) {
            System.out.println("Idade inválida");
        } else {
            idade = age;
        }
    }

    public int getIdade(){
        return idade;
    }

}
