package OOP.List;

import java.util.ArrayList;
import java.util.List;

public class MaisListas {
    public static void main(String[] args) {

        String[] items = {"apples", "bananas", "oranges", "peaches"};

        //o método list.of transforma um array em uma lista
        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        //get name fornece algumas informações adicionais
        System.out.println(list.getClass().getName());
    }
}
