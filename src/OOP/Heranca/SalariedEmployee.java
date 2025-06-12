package OOP.Heranca;

public class SalariedEmployee extends Employee {
    double annuaalSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        annualSalary = annualSalary;
    }

    @Override
    public double collectPay(){
        double paycheck = annuaalSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 + paycheck : paycheck;
        return (int) adjustedPay;
    }

    public void retire(){
        terminate("12/12/2025");
        isRetired = true;
    }
}
