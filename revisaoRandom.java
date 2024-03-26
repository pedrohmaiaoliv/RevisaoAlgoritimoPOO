import java.util.Scanner;
import java.util.Random;

public class revisaoRandom {

    public static void main(String[] args) {
        

        System.out.println("Bem vindo ao programa para descobrir se o aluno vai passar!");
        System.out.println("Primeiramente, preciso saber, quantos alunos possui na sala? ");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        double maiorMedia = 0;
        double menorMedia = 0;
        double mediaTurma = 0;

        

            for (int n = 0; n < 100; n++) {
             
                double nota1 = 0 + (10-0) * rand.nextDouble();
                double nota2 = 0 + (10-0) * rand.nextDouble();

                double media = (nota1+nota2)/2;
                if (n == 0 || maiorMedia < media){
                    maiorMedia = media;
                }
                if (n == 0 || menorMedia > media) {
                    menorMedia = media;
                }
                mediaTurma +=media;

            System.out.println("As notas do aluno %d são: %.2f e %.2f\n" + (n + 1) + " são: " + nota1 + " e " + nota2);
            System.out.println("A media do aluno %d é: %.2f e %.2f\n" + (n + 1) + " é: " + media);



                System.out.println("A média do aluno é: " + media);

                    if(media >=9){
                        System.out.println("Parabéns, Excelente!");

                    }else if(media >= 6 ) {
                        System.out.println("Aluno aprovado, ok né?");
                        
                    }else if(media >= 4) {
                        System.out.println("Aluno em recuepração! vai fazer N3 em!");
                    }else{
                        System.out.println("Ihhhhhhhhhhh!!");
            }
        }

        System.out.printf("A maior média da turma é: %.2f\n", maiorMedia);
        System.out.printf("A menor média da turma é: %.2f\n", menorMedia);
        System.out.printf("A média da turma é: %.2f\n", mediaTurma / 100);
    }
}