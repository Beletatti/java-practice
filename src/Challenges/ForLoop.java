package Challenges;

public class ForLoop {
    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("i = " + i);
//        }
//
//        for (double rate = 2.0; rate <= 5.0; rate += 0.5){
//            double interestAmount = calculateInterest(10000.0, rate);
//            if (interestAmount > 2.5){
//                break;
//            }
//        }
//        int count = 0;
//
//        for (int i = 10; i <= 50; i++){
//            if (isPrime(i)){
//                System.out.println(i + " is a prime number");
//                count++;
//                if (count == 5){
//                    System.out.println("We have found 5 prime numbers");
//                    break;
//                }
//
//            }
//        }

        int count = 0;
        int sum = 0;

        for (int i = 1; count < 5 && i <= 100; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                sum += i;
                count++;
                System.out.println("Sum = " + sum);
            }
        }


        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");
    }

//    public static double calculateInterest(double amount, double interestRate){
//        return (amount * (interestRate / 100));
//    }

    public static boolean isPrime(int wholeNumber){

        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++){
            if (wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
