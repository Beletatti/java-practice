package OOP.Composição;

public class ComposiçãoChallenge {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDoo(true);
//        kitchen.getIceBox().setHasWorkToDoo(true);
//        kitchen.getBrewMaster().setHasWorkToDoo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }

}
