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
            System.out.println(getInputFromScanner(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

//    public static String getInputFromConsole(int currentYear){
//
//        String name = System.console().readLine("What's your name? ");
//        System.out.println("Hello " + name + "!");
//        String dateOfBirth = System.console().readLine("What year you born? ");
//        int age = currentYear - Integer.parseInt(dateOfBirth);
//
//        return "So you are " + age + " years old";
//
//    }

    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("What's your name? ");
        System.out.print("What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");

        System.out.print("What year were you born? ");

        boolean validDOB = false;
        int age = 0;

        do{
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + currentYear);
            try{
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData){
                System.out.println("Invalid input. Please enter a number.");
            }
        } while (!validDOB);

        return "So you are " + age + " years old";

    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }

        return (currentYear - dob);
    }
}

// para rodar o código no terminal: java src/ o caminho do arquivo dentro do projeto