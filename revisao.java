import java.util.Scanner;

public class revisao {

    public static void main(String[] args) {
        

        System.out.println("Bem vindo ao programa para descobrir se o aluno vai passar!");

        Scanner sc = new Scanner(System.in);
        System.out.print ("digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print ("digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1+nota2)/2;

        System.out.println("A média do aluno é: " + media);

            if(media >=9){
                System.out.println("Parabéns, Excelente!");

            }else if(media >= 6 ) {
                System.out.println("Aluno aprovado, ok né?");
                
            }else if(media >= 4) {
                System.out.println("Aluno em recuepração! vai fazer N3 em!");
            }else{
                System.out.println("Aluno reprovado direto!");
            }
    }
}