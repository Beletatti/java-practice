package Challenges;

public class WhileLoop {

    // diferença da estrutura do loop for pro loop while
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++){
//            System.out.println(i);
//        }
//
//        int j = 1;
//        while (true){
//            if (j > 5){
//                break;
//            }
//            System.out.println(j);
//            j++;
//        }
//
//        // estrutura "do-while"
//        int k = 1;
//        boolean isReady = false;
//        do {
//            if (k > 5){
//                break;
//            }
//            System.out.println(k);
//            k++;
//        } while (isReady);
//
//        // estrutura com "continue"
//
//        int number = 0;
//        while (number < 50){
//            number += 5;
//            if (number % 25 == 0){
//                continue;
//            }
//            System.out.println(number + "_");
//        }

//  Challenge: Step 1 is to create a method called isEvenNumber that takes a paramater of type int.
//  Its purpose is to determine if the argument passed to the method is an even number or not
//  return true from the method if it's an even number; otherwise, return false
//  Next, use a while loop to test a range of numbers from 5 up to and including 20,
//  but printing out only the even numbers determined by the call to the isEvenNumber method

        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= finishNumber){
            number ++;
            if (!isEvenNumber(number)) {
                oddCount++;
                continue;
            }
            System.out.println("Even Number " + number);
            evenCount++;
            if (evenCount >= 5){
                break;
            }
        }
        System.out.println("Total odd numbers found: " + oddCount);
        System.out.println("Total even numbers found: " + evenCount);
    }

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}

// WHILE:
// while(condition) {
// }

// DO-WHILE:
// do{
//     statements
// } while (condition);

// continue; (continua o loop (pula) o código dependendo da condição)
// break; (para o código)
