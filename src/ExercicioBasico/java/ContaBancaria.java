package ExercicioBasico.java;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public void setTitular(String nomeTitular){
        titular = nomeTitular;
    }

    public String getTitular(){
        return titular;
    }

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido.");
        } else {
            saldo += valor;
        }
    }

    public void sacar(double valor){
        if (valor <= 0) {
            System.out.println("Valor invalido");
        } else if (valor > saldo){
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
        }
    }

    public double getSaldo(){
        return saldo;
    }
}
