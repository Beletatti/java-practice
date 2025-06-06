package Challenges;

import java.util.Scanner;

public class AnotherExercice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        double sum = 0;

        do{
            System.out.println("Enter number #" + counter + ":");
            String nextNumber = scanner.nextLine();
            try{
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe){
                System.out.println("Invalid number. Please enter a number.");
            }
        } while (counter <= 5);

        System.out.println("The sum of the 5 number = " + sum);

    }
}
