//Write a method called checkNumber with an int paramater named number.
//
//The method should not return any value, and it needs to print out:
//
//        - "positive" if the paramater number is > 0
//        - "negative" if the paramater number is < 0
//        - "zero" if the paramater number is equal to 0
//
//NOTE: The checkNumber method needs to be defined as public static like we have been doing so far in the course.
//
//NOTE: Do not add a main method

package Challenges;

public class PositiveNegativeZero {

    public static void checkNumber(int number){

        if (number > 0){
            System.out.println("positive");
        } else if (number < 0){
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
