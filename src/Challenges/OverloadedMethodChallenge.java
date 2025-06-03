//Crie dois métodos com o mesmo nome: convertToCentimeters
//
//O primeiro método tem um parâmetro do tipo int, que representa a altura total em polegadas.
// Você converterá polegadas para centímetros neste método e retornará o número de centímetros como um double.
//
//O segundo método tem dois parâmetros do tipo int, um para representar a altura em pés e outro para representar a altura restante em polegadas. Portanto, se uma pessoa tem 1,62 m,
// os valores 5 para pés e 8 para polegadas seriam passados para este método.
//  Este método converterá pés e polegadas para apenas polegadas e, em seguida, chamará o primeiro
//  método para obter o número de centímetros, retornando também o valor como um double.
//
//Ambos os métodos devem retornar um número real ou um valor decimal para a altura total em centímetros.
//
//Chame ambos os métodos e imprima os resultados.
//
//A fórmula de conversão de polegadas para centímetros é 1 polegada = 2,54 cm.
//
//        Lembre-se também de que um pé = 12 polegadas.

package Challenges;

public class OverloadedMethodChallenge {
    public static void main(String[] args) {
        // Teste 1: Converter 72 polegadas para centímetros
        double centimeters = convertToCentimeters(72);
        System.out.println("72 polegadas são " + centimeters + " centímetros.");

        // Teste 2: Converter 5 pés e 8 polegadas para centímetros
        double centimetersFromFeetInches = convertToCentimeters(5, 8);
        System.out.println("5 pés e 8 polegadas são " + centimetersFromFeetInches + " centímetros.");
    }

    // Método 1: Converter polegadas em centímetros
    public static double convertToCentimeters(int inchesToCentimeters){
        return inchesToCentimeters * 2.54;
    }

    // Método 2: Converter pés e polegadas para centímetros
    public static double convertToCentimeters(int feet, int inches){
        return convertToCentimeters(feet * 12 + inches);
    }
}