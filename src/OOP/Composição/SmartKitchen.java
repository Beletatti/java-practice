package OOP.Composição;

public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        brewMaster.setHasWorkToDoo(coffeeFlag);
        iceBox.setHasWorkToDoo(fridgeFlag);
        dishWasher.setHasWorkToDoo(dishWasherFlag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}

class CoffeeMaker {

    private boolean hasWorkToDoo;

    public void setHasWorkToDoo(boolean hasWorkToDoo) {
        this.hasWorkToDoo = hasWorkToDoo;
    }

    public void brewCoffee() {
        if(hasWorkToDoo){
            System.out.println("Brewing coffee");
            hasWorkToDoo = false;
        }
    }
}

class Refrigerator {

    private boolean hasWorkToDoo;

    public void setHasWorkToDoo(boolean hasWorkToDoo) {
        this.hasWorkToDoo = hasWorkToDoo;
    }

    public void orderFood() {
        if(hasWorkToDoo){
            System.out.println("Ordering Food");
            hasWorkToDoo = false;
        }
    }
}

class DishWasher {

    private boolean hasWorkToDoo;

    public void setHasWorkToDoo(boolean hasWorkToDoo) {
        this.hasWorkToDoo = hasWorkToDoo;
    }

    public void doDishes() {
        if(hasWorkToDoo){
            System.out.println("washing dishes");
            hasWorkToDoo = false;
        }
    }
}


