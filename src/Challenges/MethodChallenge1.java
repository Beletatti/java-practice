//DESAFIO:
// criar um método chamado displayHighScorePosition.
// esse método deve ter dois parâmetros, um para o nome do jogador e outro para a posição do jogador em uma lista de pontuações altas
// o método deve imprimir uma mensagem como "tim conseguiu chegar a posição 2 na lista de pountuação máxima"

// criar um segundo método chamado calculateHighPosition
// esse método deve ter apenas um parâmetro, a pontuação do jogador
// o método deve rettornar um número entre 1 e 4, com base nos valores de pontuação com base nessa tablea:
// Score greather than or qual to 1000 = 1
// score greater than or equal to 500 but less than 1000 = 2
// score greater than or equal to 100 but less than 500 = 3
// All other scores = 4

// por fim chamaremos os dois métodos e exiberemos os resultados para as seguintes pontuações: 1500, 1000, 500, 100 e 25

package Challenges;

public class MethodChallenge1 {
    public static void main(String[] args) {

        //#3 Passo
        int position = calculateHighPosition(1500);
        displayHighScorePosition("Tim", position);

        position = calculateHighPosition(1000);
        displayHighScorePosition("Bob", position);

        position = calculateHighPosition(500);
        displayHighScorePosition("Kaique", position);

        position = calculateHighPosition(100);
        displayHighScorePosition("Guia", position);

        position = calculateHighPosition(25);
        displayHighScorePosition("Nunes", position);


    }

    // #1 Primeiro passo
    public static void displayHighScorePosition(String playerName, int playerPosition){

        System.out.println(playerName + " conseguiu chegar a posição " + playerPosition + " na lista de pontuação máxima");
    }

    //#2 Passo
    public static int calculateHighPosition(int playerScore) {

        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
