package OOP.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaisListas {
    public static void main(String[] args) {

        String[] items = {"apples", "bananas", "oranges", "peaches"};

        //o método list.of transforma um array em uma lista
        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yourgut");
        System.out.println(groceries);
        //get name fornece algumas informações adicionais
        //System.out.println(list.getClass().getName());

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        // o .get pega um item em uma posição especifica da lista
        System.out.println("Third item = " + groceries.get(2));

        //o método .contains busca um item especifico na lista, e volta um booleano
        //nesse caso está conferindo se tem mustard e voltando true, que vai realizar o print
        if (groceries.contains("mustard")) {
            System.out.println("List contais mustard");
        }

        //o método indexOf e lastIndexOf retorna a posição do valor na lista, nesse caso como tem 2 yogurt
        //o .indexOf irá retornar a posição do primeiro na lista, e o .lastIndexOf irá retornar o ultimo
        groceries.add("yogurt");
        System.out.println("first = " + groceries.indexOf("yogurt"));
        System.out.println("last = " + groceries.lastIndexOf("yogurt"));

        System.out.println(groceries);
        //o método .remove serve para remover um valor em uma posição especifica ou diretamente o valor
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);

        //o método .removeAll remove todos os valores que voce pedir
        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);

        groceries.retainAll(List.of("apples", "milk", "mustard", "cheese"));
        System.out.println(groceries);

        //método clear remove a lista inteira
        groceries.clear();
        System.out.println(groceries);
        //método isEmpty retorna true ou false ao conferir se a lista está vazia
        System.out.println("isEmpty = " + groceries.isEmpty());

        //adiciona elementos a lista
        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "cheese"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);
        
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}
