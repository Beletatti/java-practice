package Challenges;
import java.util.Scanner;

public class AboutClasses {

    public static void main(String[] args) {

        int currentYear = 2022;
//        String usersDateOfBirth = "1999";
//
//        // estou pegando da classe Integer, o método estático dentro dela chamado parseInt,
//        // e atribuindo a variavel do tipo String usersDateOfBirth no parâmetro desse método,
//        // que transforma string em integer

//        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
//
//        System.out.println("Age = " + (currentYear - dateOfBirth));
//
//        // mesma coisa aqui, porém transformando string em double

//        String usersAgeWithPartialYear = "22.5";
//        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
//        System.out.println("The user sayes he's = " + ageWithPartialYear);

        // interage com o terminal
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear){

        String name = System.console().readLine("What's your name? ");
        System.out.println("Hello " + name + "!");
        String dateOfBirth = System.console().readLine("What year you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";

    }

    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("What's your name? ");
        System.out.print("What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");

        System.out.print("What year were you born? ");
        String dateOfBirth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";

    }
}

// para rodar o código no terminal: java src/ o caminho do arquivo dentro do projeto