import java.util.Scanner;

public class mainAula
{
	static Scanner sc = new Scanner(System.in);
	public static String inputString(String mensagem){

		System.out.print(mensagem);
		return sc.nextLine();

	}

	public static void main(String[] args) {
		
		String nome = inputString("Digite o nome: ");
		
		
		System.out.print("Digite a idade: ");
		int idade = sc.nextInt();
		
		Aluno aluno = new Aluno(nome, idade);
		
		System.out.print("Digite a nota1: ");
    	aluno.nota1 = sc.nextDouble();
    		
    	System.out.print("Digite a nota2: ");
    	aluno.nota2 = sc.nextDouble();
    	
    	System.out.printf("Nome: %s \tIdade: %d  Situação: %b\n", aluno.nome, aluno.idade, aluno.situacao);
    	System.out.printf("\tNota 1: %.1f \tNota2: %.1f \t", aluno.nota1, aluno.nota2);
    		
    	// double media = (aluno.nota1+aluno.nota2)/2;

        System.out.printf("Media = %.1f ", aluno.getMedia());
    	
		aluno.printSituacao();
		
	}
}