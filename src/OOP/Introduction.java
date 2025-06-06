package OOP;

public class Introduction {

    public static void main(String[] args) {
        // instanciando a classe car para pegar seus campos
        Car car = new Car();
        //depois de instanciar a classe car, estou utilizando o método setMake(ou outros sets)
        //dentro da classe car para definir os valores dos campos da classe
        car.setMake("Maserati-");
        car.setModel("Carrera");
        car.setColor("Red");
        car.setConvertible(false);
        car.setDoors(2);

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Targa");
        targa.setModel("Carrera");
        targa.setColor("Black");
        targa.setConvertible(true);
        targa.setDoors(2);

        targa.describeCar();
    }

}
