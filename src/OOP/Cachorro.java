package OOP;

public class Cachorro extends HerançaAnimal {

    private String earShape;
    private String tailShape;
    // para extender a classe pai você tem que criar um construtor
    // na classe filha.
    public Cachorro(){
        // super é uma maneira de chamar o construtor na superclasse
        // diretamente da subclasse, nesse caso cachorro
        // bem parecido com a keyword this, deve ser chamado primeiro no construtor
        super("Mutt", "Big", 50);
    }

    public Cachorro(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Cachorro(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "Small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){
        if (type == "Wolf"){
            System.out.println("Ow Wooooo!");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail");
        if (speed == "slow"){
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark(){
        System.out.print("Woof!");
    }

    private void run(){
        System.out.print("Dog Running");
    }

    private void walk(){
        System.out.print("Dog Walking");
    }

    private void wagTail(){
        System.out.print("Dog Wagging Tail");
    }
}
