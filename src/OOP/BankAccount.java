package OOP;

public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    // o nome do construtor deve ter o mesmo nome que a classe e não ter nenhum tipo de retorno
    public BankAccount(){
        this(234, 200, "Guia", "<EMAIL>", 1197037391);
        System.out.println("Construtor vazio chamado");
    }

    public BankAccount(int accountNumber, double accountBalance, String customerName, String email, int phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String email, String customerName, int phoneNumber) {
        this(9999, 100.55, customerName, email, phoneNumber);
        this.email = email;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount){
        accountBalance += amount;
    }

    public void withdraw(double amount){
        if (accountBalance - amount < 0){
            System.out.println("Saldo Insuficiente. Saque não realizado.");
        } else {
            accountBalance -= amount;
            System.out.println("Saque de " + amount + " Realizado com sucesso. Seu sado atual: " + accountBalance);
        }
    }
}
