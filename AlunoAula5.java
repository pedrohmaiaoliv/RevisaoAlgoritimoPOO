public class AlunoAula5 {
    
    String nome;
    int idade;
    boolean situacao;
    double nota1, nota2;
        
        public AlunoAula5(String nome, int idade){
            this(idade, nome);
            this.nome = nome;
            this.idade = idade;
            this.situacao = true;
        }

        public AlunoAula5(int idade, String nome){
            this();
            System.out.println("Passei pelo construtor bem aqui tbm!");
        }

        public AlunoAula5(){
            System.out.println("Passei pelo contstrutor");
        }

        public double getMedia(){
            return(nota1+nota2)/2;
        }
       
        public void printSituacao(){
            double media = this.getMedia();
            if (media >= 9) {
                System.out.println("Excelente, aluno aprovado!");
            } else if (media >=6) {
                System.out.println("Aluno aprovado!");
            } else if (media >=4) {
                System.out.println("Aluno em recuperação, fazer N3.");
            } else {
                System.out.println("Aluno reprovado.");
            }

        }


}