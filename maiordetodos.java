// fazer uma matriz 4x4 que depois percorre e busca qual o maior valor de todos entrou na matriz (coloquei random de 0 a 100)

import java.util.Random;

public class maiordetodos {

//aqui eu começo a fazer as declarações de variáveis
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];
        int maiorValor = matriz[0][0];
        int maiorLinha = 0;
        int maiorColuna = 0;
        
// aqui eu vou fazer a impressão da matrix com valores aleatórios de 0 a 100, para que depois entre em uma condicional de IF, para que possa procurar nas novas variáveis, qual o valor maior de todos em qual linha e qual coluna;
        System.out.println("Matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(101);
                System.out.print(matriz[i][j] + "\t");

                
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    maiorLinha = i;
                    maiorColuna = j;
                }
            
            }
            System.out.println();
        }

        System.out.println("O maior Valor de todos é: " + maiorValor + "Na Linha: " + maiorLinha + "Na Coluuna: " + maiorColuna);
                
    }
}
           
       
    
    
        


    
