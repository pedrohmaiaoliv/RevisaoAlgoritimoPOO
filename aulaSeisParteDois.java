import java.util.Scanner;
import java.util.Random;

public class aulaSeisParteDois
{
	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		double maiorMedia = 0;
        double menorMedia = 0;
        double mediaTurma = 0;
        int quantidade = 0;
                    
       // double[][] resultados = null;
        Aluno[] alunos = null;
		
		int op = 0;
		while(op != 4) {
		    System.out.println("1. Carregar notas");
		    System.out.println("2. Relatorio de notas");
		    System.out.println("3. Zerar contador");
		    System.out.println("4. Sair");
		    
		    System.out.print("Escolha uma das opcoes: ");
		    op = sc.nextInt();
		    
		    switch(op) {
		        case 1:
		            System.out.println("Carregando notas dos alunos");
		            
		            if (alunos != null) {
		                System.out.println("Notas ja carregadas!");
		                break;
		            }
		            
		            System.out.print("Digite a quantidade de alunos: ");
            		quantidade = sc.nextInt();
                    
                    //resultados = new double[quantidade][3];
                    alunos = new Aluno[quantidade];
                    
            		for(int n = 0; n < quantidade; n++) {
            		
            		    alunos[n] = new Aluno();
                		//resultados[n][0] = rd.nextInt(101)/10.0;
                		alunos[n].notas[0] = rd.nextInt(101)/10.0;
                		
                		//resultados[n][1] = rd.nextInt(101)/10.0;
                		alunos[n].notas[1] = rd.nextInt(101)/10.0;
                		
                		//resultados[n][2] = (resultados[n][0]+resultados[n][1])/2;
                		double media = (alunos[n].notas[0] + alunos[n].notas[1])/2; 
                		
                		mediaTurma += media;
                		
                		if (media > maiorMedia) {
                		    maiorMedia = media;
                		}
                		
                		if (media < menorMedia || n == 0) {
                		    menorMedia = media;
                		}
                		
            		}
		            
		            break;
		        case 2:
		            System.out.println("Imprimindo relatorio dos alunos");
		            System.out.println("######## RELATORIO DE MEDIAS #############");
		            
		            if (alunos == null) {
		                System.out.println("Nao existem notas no sistema!");
		                break;
		            }
		            
            		for(Aluno a : alunos) {
            		    double nota1 = a.notas[0];
            		    double nota2 = a.notas[1];
            		    double media = (a.notas[0] + a.notas[1])/2;
            		    
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
            		System.out.printf("Quantidade de alunos = %d \n", Aluno.contador);
		            
		            break;
		        case 3:
		            System.out.println("Zerado o total de alunos, de um total: " + Aluno.zerarContador());
		            System.out.printf("Quantidade de alunos atualmente = %d \n", Aluno.contador);
		            break;
		        case 4:
		            System.out.println("Saindo do sistema!");
		            break;
		        default:
		            System.out.println("Opcao errada, escolha uma das alternativas abaixo:");
		    }
		    
		}
	}
}