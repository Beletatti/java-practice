package OOP;

public class Car {

    //abaixo estão o que chamamos de "campos" da classe Car
    //definidos fora de um método, apenas dentro da classe
    private String make = "Tesla";
    private String model = "Model S";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    //um getter é um método em um classe que
    // recupera o valor de um campo privado e o retorna.
    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    //THIS é um nome de referência especial para o objeto ou instancia, que pode ser usado para
    // descrever a si mesmo. podemos usar THIS para acessar os campos da classe.
    //maneira de atualizar o atributo make no carro usando um método em vez de tentar acessa-lo diretamente
    public void setMake(String make) {
        //this.make = make;
        if (make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "holden", "porshe", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsopported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(doors + "Door" +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "convertible" : "not convertible"));
    }
}
