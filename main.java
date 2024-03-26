public class main
{
    public static void main(String[] args) {
        Aluno pedro = new Aluno ();
        pedro.nome = "Pedro Oliveira";
        pedro.idade = 36;
        pedro.situacao = true;
        pedro.notas[0] = 10.0;
        pedro.notas[1] = 9.9;

        System.out.println("O aluno " + pedro.nome + " tem os seguintes dados: ");
        System.out.println("Idade : " + pedro.idade);
        System.out.println("A situação do aluno seria: " + pedro.situacao);
        System.out.println("Sua primeira nota é " + pedro.notas[0]);
        System.out.println("Sua segunda nota é " + pedro.notas[1]);
    }  
        
}
