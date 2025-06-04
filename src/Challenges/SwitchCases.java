package Challenges;

public class SwitchCases {
    public static void main(String[] args) {

        String presenteGabriela = "brutal";

        switch (presenteGabriela) {
            case "presente" -> System.out.println("muito bom");
            case "presente2" -> System.out.println("ok");
            case "camiseta", "play 5", "grip", "barra", "qualquer outro presente" -> System.out.println("nice");
            default -> System.out.println("its over");
        }

        String charLetter = "f";
        System.out.println(getChar(charLetter));

    }

    public static String getChar(String charLetter) {
        switch (charLetter) {
            case "A":
                return "Able";
            case "B":
                return "Baker";
            case "C":
                return "Charlie";
            case "D":
                return "Dog";
            case "E":
                return "Easy";
            default:
                return "Invalid letter";
        }
    }
}

