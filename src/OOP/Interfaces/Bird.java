package OOP.Interfaces;

// uma classe só pode estender uma unica classe, e é por isso que o Java suporta apenas herança única
// uma classe pode implementar muitas interfaces, o que proporciona flexibilidade e modularidade
public class Bird extends Animal implements FlightEnabled, Trackable {

    @Override
    public void move() {
        System.out.println("Flaps wings");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {

        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {

        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void track() {

        System.out.println(getClass().getSimpleName() + " s coordinates recorded");
    }
}
