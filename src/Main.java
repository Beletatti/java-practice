//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        int value = 1;
//        if (value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        String presenteGabriela = "brutal";

        switch (presenteGabriela) {
            case "presente" -> System.out.println("muito bom");
            case "presente2" -> System.out.println("ok");
            case "camiseta", "play 5", "grip", "barra", "qualquer outro presente" ->
                    System.out.println("nice");
            default -> System.out.println("its over");
        }

        String charLetter = "f";
        System.out.println(getChar(charLetter));

    }

    public static String getChar(String charLetter){
        switch (charLetter){
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
            default: return "Invalid letter";
        }
    }

}
