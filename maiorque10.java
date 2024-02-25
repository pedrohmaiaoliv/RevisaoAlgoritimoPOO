//Matriz 4x4, que irá fazer uma contagem de quais valores são maiores que 10;

import java.util.Random;

public class maiorque10 {

//aqui eu começo a fazer as declarações de variáveis, como teremos um contador, eu tbm coloquei uma variável para a contagem;
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];
        int contagem = 0;
// aqui eu vou fazer a impressão da matrix com valores aleatórios de 0 a 15, para que depois entre em uma condicional de IF, se algum valor da matriz for > 10, adicione a contagem;
        System.out.println("Matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(15);
                System.out.print(matriz[i][j] + "\t");
                if (matriz[i][j] > 10) {
                    contagem++;
                }
            }
            System.out.println();
        }
// por ultimo me traga a contagem final;
        System.out.println("Quantidade de valores maiores que 10: " + contagem);
    }
}