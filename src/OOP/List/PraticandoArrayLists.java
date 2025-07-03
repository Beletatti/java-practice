package OOP.List;

import java.util.Arrays;
import java.util.ArrayList;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }
}

public class PraticandoArrayLists {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("milk", "PRODUCE", 5);

        System.out.println(Arrays.toString(groceryArray));

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        //adiciona um item a lista
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("apples", "PRODUCE", 6));
        groceryList.add(new GroceryItem("milk"));
        //ao colocar o index 0, ele move todos os outros pra frente ao inseri-lo na posição 0 da arraylist
        groceryList.add(0,
                new GroceryItem("milk", "PRODUCE", 5));
        //remove o objeto na posição 0
        groceryList.remove(0);
        System.out.println(groceryList);
    }
}