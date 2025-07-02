package OOP.Arrays;

import java.util.Arrays;

public class MultipleArrays {
    public static void main(String[] args) {

        //iniciando array bidimensional
        //no primeiro [] definimos quantas arrays
        //no segundo [] definimos o tamanho dessas arrays
        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);

        //cada array será printada em sua propria linha
        for (int[] outer : array2) {
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < array2.length; j++) {
                array2[i][j] = (i * 10) + (j + 1);
            }
        }

        //imprime todas as arrays em uma unica linha
        System.out.println(Arrays.deepToString(array2));

        array2[1] = new int[] {10, 20, 30};
        System.out.println(Arrays.deepToString(array2));
    }



}
