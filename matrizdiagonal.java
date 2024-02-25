// fazer uma matriz que toda a diagonal seja 1 e o resto dos valores 0;

public class matrizdiagonal {
    public static void main(String[] args) {
        // Criando a matriz 5x5
        int[][] matriz = new int[5][5];

        // aqui podemos ver o preenchimento das diagonais
        for (int i = 0; i < 5; i++) {
            matriz[i][i] = 1;
        }
        // imprimindo toda a matriz
        System.out.println("Imprimindo a Matriz Completa:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}