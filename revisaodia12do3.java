import java.util.Scanner;
import java.util.Random;

public class revisaodia12do3
{
	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
        int op = 0;
		while(op !=3 ) {
            System.out.println("1. Carregar notas");
            System.out.println("2. Imprimir Relatorio");
            System.out.println("3. Sair");

            System.out.print("Escolha uma das opções: ");
            op = sc.nextInt();
            switch(op){
                case 1:
                System.out.println("Carregando Nota dos Alunos!");
                    break;
                case 2:
                System.out.println("Imprimindo Relatorio dos Alunos");
                    break;
                case 3:
                System.out.println("Saindo!!");
                    break;
                default:
                System.out.println("Opção Errada, escolha uma das alternativas válidas: ");
            }
            
        }

        
        System.out.print("Digite a quantidade de alunos: ");
		int quantidade = sc.nextInt();
        
        double maiorMedia = 0;
        double menorMedia = 0;
        double mediaTurma = 0;
        double[][] resultados = new double[quantidade][3];
        
		for(int n = 0; n < quantidade; n++) {
		
    		resultados[n][0] = rd.nextInt(101)/10.0;
    		
    		resultados[n][1] = rd.nextInt(101)/10.0;
    	
    		// System.out.printf("Nota 1: %.1f \tNota2: %.1f \t", nota1, nota2);
    		
    		resultados[n][2] = (resultados[n][0]+resultados[n][1])/2;
    	
    		// System.out.printf("Media = %.1f  ", media);
    		
    		mediaTurma += resultados[n][2];
    		
    		if (resultados[n][2] > maiorMedia) {
    		    maiorMedia = resultados[n][2];
    		}
    		
    		if (resultados[n][2] < menorMedia || n == 0) {
    		    menorMedia = resultados[n][2];
    		}
    		
    		
		}
		
        System.out.println("###### RELATORIO DE MEDIAS ######!!");

        for(double[] r : resultados) {
            double nota1 = r[0];
            double nota2 = r[1];
            double media = r[2];

            System.out.printf("Nota 1: %.1f \tNota2: %.1f \t", nota1, nota2);

            System.out.printf("Media = %.1f  ", media);

            if (r[2] >= 9) {
    		    System.out.println("Excelente, aluno aprovado!");
    		} else if (r[2] >=6) {
    		    System.out.println("Aluno aprovado!");
    		} else if (r[2] >=4) {
    		    System.out.println("Aluno em recuperação, fazer N3.");
    		} else {
    		    System.out.println("Aluno reprovado.");
    		}
        }
        System.out.println("###### MAOR MEDIA/MENOR MEDIA/MEDIA DA TURMA! ######!!");
		System.out.printf("A maior media = %.1f \n", maiorMedia);
		System.out.printf("A menor media = %.1f \n", menorMedia);
		System.out.printf("A media da turma = %.1f \n", mediaTurma/quantidade);
	}
}