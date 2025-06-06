package OOP;

public class BankClassChallenge {
    public static void main(String[] args) {

        // seta os valores dos objetos via construtor
        //BankAccount account = new BankAccount(12345, 100, "Kaique", "kaiquebeletatti@gmail.com", 1197037391 );
        BankAccount account = new BankAccount();

          // seta o valor dos objetos na mão
//        account.setAccountNumber(123456789);
//        account.setCustomerName("Kaique");
//        account.setAccountBalance(1000.00);
//        account.setPhoneNumber(1197037391);
//        account.setEmail("kaiquebeletatti@gmail.com");

        account.deposit(400);
        account.withdraw(1200.00);

        BankAccount timsAccount = new BankAccount(123456789, 1000.00, "Tim", "<EMAIL>", 1197037391);
        System.out.println("AccountNo: " + timsAccount.getAccountNumber() + "; name " + timsAccount.getCustomerName());

//        System.out.println("Seu saldo atual: " + account.getAccountBalance());
    }
}
