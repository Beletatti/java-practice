package ExercicioBasico.java;

public class Aluno {

    private String nome;
    private double nota;

    public void setNome(String nomeAluno){
        nome = nomeAluno;
    }

    public String getNome(){
        return nome;
    }

    public void setNota(double notaAluno){
        if (notaAluno > 10 || notaAluno < 0){
            System.out.println("Nota invalida");
        } else {
            nota = notaAluno;
        }
    }

    public double getNota(){
        return nota;
    }

    public String getStatus(){
        if (nota >= 7){
            return "Aprovado";
        } else if (nota >= 5) {
            return "Recuperação";
        } else return "Reprovado";
    }
}
