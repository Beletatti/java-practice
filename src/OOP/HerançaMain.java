package OOP;

public class HerançaMain {
    public static void main(String[] args) {

        HerançaAnimal animal = new HerançaAnimal("Animal Genérico", "Huge", 400);
        doAnimalStuff(animal, "Fast");

        Cachorro cachorro = new Cachorro();
        doAnimalStuff(cachorro, "fast");

        Cachorro yorkie = new Cachorro("Yorkie", 15);
        doAnimalStuff(yorkie, "slow");

        Cachorro retriever = new Cachorro("Retriever", 65,
                "Floppy", "Swimmer");
        doAnimalStuff(retriever, "fast");

        Cachorro wolf = new Cachorro("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");
    }

    public static void doAnimalStuff(HerançaAnimal herancaAnimal, String speed){
        herancaAnimal.makeNoise();
        herancaAnimal.move(speed);
        System.out.println(herancaAnimal);
        System.out.println("_ _ _ _");
    }
}
