package OOP.Enum;

import java.util.Random;

public class TestandoEnum {
    public static void main(String[] args) {

//        TesteEnum diaDaSemana = TesteEnum.TER;
//        System.out.println(diaDaSemana);
//
//        for (int i = 0; i < 10; i++ ) {
//            diaDaSemana = DiaAleatorio();
//            System.out.printf("Name is %s, Ordinal Value = %d%n",
//                    diaDaSemana.name(), diaDaSemana.ordinal());
//
//            if (diaDaSemana == TesteEnum.QUI){
//                System.out.println("Uma Quinta!!");
//            }
//        }

        switchDiaDaSemana(TesteEnum.SEG);

        for (Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }
    }

    public static void switchDiaDaSemana(TesteEnum diaDaSemana) {
        int diaDaSemanaInteger = diaDaSemana.ordinal() + 1;
        switch (diaDaSemana) {
            case DOM -> System.out.println("Domingo é dia " + diaDaSemanaInteger);
            case SEG -> System.out.println("Segunda é dia " + diaDaSemanaInteger);
            default -> System.out.println(diaDaSemana.name().charAt(0) +
                    "dia é Dia " + diaDaSemanaInteger);
        }
    }

    public static TesteEnum DiaAleatorio () {

        //o 7 no nextInt limita em 7 numeros int
        int randomInteger = new Random().nextInt(7);
        var allDays = TesteEnum.values();

        return allDays[randomInteger];
    }
}
