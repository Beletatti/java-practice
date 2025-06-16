package OOP.Encapsulamento;

public class EncapsulamentoMain {
    public static void main(String[] args) {
        JogadorEncapsulado tim = new JogadorEncapsulado("Guia");
        System.out.println("Initial health is " + tim.healthRemaining());
    }
}
