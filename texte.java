import java.util.Scanner;
import java.util.Random;

public class texte
{
	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		double maiorMedia = 0;
        double menorMedia = 0;
        double mediaTurma = 0;
        int quantidade = 0;
                    
        double[][] resultados = null;
		
		int op = 0;
		while(op != 3) {
		    System.out.println("1. Carregar notas");
		    System.out.println("2. Relatorio de notas");
		    System.out.println("3. Sair");
		    
		    System.out.print("Escolha uma das opcoes: ");
		    op = sc.nextInt();
		    
		    switch(op) {
		        case 1:
		            System.out.println("Carregando notas dos alunos");
		            
		            if (resultados != null) {
		                System.out.println("Notas ja carregadas!");
		                break;
		            }
		            
		            System.out.print("Digite a quantidade de alunos: ");
            		quantidade = sc.nextInt();
                    
                    resultados = new double[quantidade][3];
                    
            		for(int n = 0; n < quantidade; n++) {
            		
                		resultados[n][0] = rd.nextInt(101)/10.0;
                		
                		resultados[n][1] = rd.nextInt(101)/10.0;
                		
                		resultados[n][2] = (resultados[n][0]+resultados[n][1])/2;
                		
                		mediaTurma += resultados[n][2];
                		
                		if (resultados[n][2] > maiorMedia) {
                		    maiorMedia = resultados[n][2];
                		}
                		
                		if (resultados[n][2] < menorMedia || n == 0) {
                		    menorMedia = resultados[n][2];
                		}
                		
            		}
		            
		            break;
		        case 2:
		            System.out.println("Imprimindo relatorio dos alunos");
		            System.out.println("######## RELATORIO DE MEDIAS #############");
		            
		            if (resultados == null) {
		                System.out.println("Nao existem notas no sistema!");
		                break;
		            }
		            
            		for(double[] r : resultados) {
            		    double nota1 = r[0];
            		    double nota2 = r[1];
            		    double media = r[2];
            		    
            		    System.out.printf("Nota 1: %.1f \tNota2: %.1f \t", nota1, nota2);
            		    
            		    System.out.printf("Media = %.1f  ", media);
            		    
            		    if (media >= 9) {
                		    System.out.println("Excelente, aluno aprovado!");
                		} else if (media >=6) {
                		    System.out.println("Aluno aprovado!");
                		} else if (media >=4) {
                		    System.out.println("Aluno em recuperaÃ§Ã£o, fazer N3.");
                		} else {
                		    System.out.println("Aluno reprovado.");
                		}
            		    
            		}
            		
            		System.out.println("######## DADOS GERAIS #############");
            		System.out.printf("A maior media = %.1f \n", maiorMedia);
            		System.out.printf("A menor media = %.1f \n", menorMedia);
            		System.out.printf("A media da turma = %.1f \n", mediaTurma/quantidade);
		            
		            break;
		        case 3:
		            System.out.println("Saindo do sistema!");
		            break;
		        default:
		            System.out.println("Opcao errada, escolha uma das alternativas abaixo:");
		    }
		    
		}
	}
}