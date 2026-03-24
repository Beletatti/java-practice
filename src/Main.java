import ExercicioBasico.java.ExercicioDay1;
import OOP.TreinandoHeranca.Book;
import OOP.TreinandoHeranca.Dog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Exercicio 2
        ExercicioDay1 exercise1 = new ExercicioDay1();
        exercise1.operacao();

        //Exercicio 3
        int outroNumero = 27;
        if (outroNumero > 10) {
            System.out.println(outroNumero + " é Maior que 10");
        } else {
            System.out.println(outroNumero + " é menor que 10");
        }

        //Exercicio 4
        int num = 58;

        if (num % 2 == 0) {
            System.out.println(num + " é par!");
        } else {
            System.out.println(num + " é impar!");
        }

        //Exercicio 5
        int idadeCondutor = 17;
        if (idadeCondutor >= 18) {
            System.out.println("pode dirigir");
        } else {
            System.out.println("não pode dirigir");
        }

        //Exercicio 6
        int notaAluno = 6;
        if (notaAluno >= 7) {
            System.out.println("Aprovado");
        } else if (notaAluno == 5 || notaAluno == 6) {
            System.out.println("recuperação");
        } else {
            System.out.println("reprovado");
        }

        //Exercicio 7
        int numero1 = 15;
        int numero2 = 25;

        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);

        // 2. Mostrar qual é o maior
        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os dois números são iguais.");
        }

        //Exercicio 1
        String nome = "Kaique";
        int idade = 26;
        double altura = 1.75;

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);


    }
}
