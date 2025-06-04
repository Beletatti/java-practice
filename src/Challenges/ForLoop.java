package Challenges;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        for (double rate = 2.0; rate <= 5.0; rate += 0.5){
            double interestAmount = calculateInterest(10000.0, rate);
            if (interestAmount > 2.5){
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}
