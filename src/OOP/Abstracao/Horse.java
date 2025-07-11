package OOP.Abstracao;

public class Horse extends Mammal{

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheeds in the spring");
    }

    @Override
    public void makeNoise() {

    }
}
