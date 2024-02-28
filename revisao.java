import java.util.Scanner;

public class revisao {

    public static void main(String[] args) {
        

        System.out.println("Bem vindo ao programa para descobrir se o aluno vai passar!");
        System.out.println("Primeiramente, preciso saber, quantos alunos possui na sala? ");
        Scanner sc = new Scanner(System.in);

        double nota1;
        double nota2;
        double maiorMedia = 0;
        double menorMedia = 0;
        double mediaTurma = 0;

        int num_alunos = sc.nextInt();

            for (int n = 0; n< num_alunos; n++) {


                System.out.println("Agora vamos digitar as notas?");
                
                    do { System.out.print ("digite a primeira nota: ");
                        nota1 = sc.nextDouble();
                        if (nota1 < 0 || nota1 > 10) {
                        System.out.println("Não existe nota menor que 0 ou maior que 10!");
                        }
                    }while (nota1 < 0 || nota1 > 10);

                
                do{ System.out.print ("digite a segunda nota: ");
                nota2 = sc.nextDouble();
                        if (nota2 < 0 || nota2 > 10) {
                        System.out.println("Não existe nota menor que 0 ou maior que 10!!");
                        }
                    }while (nota2 < 0 || nota2 > 10);
                

                double media = (nota1+nota2)/2;
                if (n == 0 || maiorMedia < media){
                    maiorMedia = media;
                }
                if (n == 0 || menorMedia > media) {
                    menorMedia = media;
                }
                mediaTurma +=media;



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

        System.out.println("A maior média da turma é: " + maiorMedia);
        System.out.println("A menor média da turma é: " + menorMedia);
        System.out.println("A média da turma é: " + mediaTurma/num_alunos);
    }
}