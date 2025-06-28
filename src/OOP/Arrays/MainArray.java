package OOP.Arrays;

import java.util.Arrays;
import java.util.Random;

public class MainArray {
    public static void main(String[] args) {

        // array com 10 elements, com a variavel myIntArray sendo a referencia
        int[] myIntArray = new int [10];
        myIntArray[5] = 50;

        double[] myDoubleArray = new double [10];
        myDoubleArray[2] = 3.5;

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("array length = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);

        int[] newArray;
//        newArray = new int[] {5, 4, 3, 2, 1};
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        //loop for pra percorrer a array inteira
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        //enhanced for loop
        System.out.println();
        for (int element : newArray){
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(newArray));

        int [] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        // exemplo de uso da binarySearch
        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Able") >= 0){
            System.out.println("Found Able in the list");
        }

        // exemplo de como usar o método equals da classe de Arrays
        // o método equals precisa receber dois argumentos que são arrays
        int[] s1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] s2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        if(Arrays.equals(s1, s2)){
            System.out.println("s1 equals s2");
        } else {
            System.out.println("s1 not equals s2");
        }



    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

}
