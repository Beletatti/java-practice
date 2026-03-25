import ExercicioBasico.java.*;
import OOP.TreinandoHeranca.Book;
import OOP.TreinandoHeranca.Dog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        conta1.depositar(1677.80);
        conta1.sacar(1562.54);
        System.out.println(conta1.getSaldo());

        Aluno aluno1 = new Aluno();
        aluno1.setNota(9);
        System.out.println(aluno1.getStatus());

        Produto produto = new Produto();
        produto.setPreco(-1);
        produto.setProduto("Bala");

       Pessoa person = new Pessoa();
       person.setNome("Kaique");
       person.setIdade(-26);

    }
}
