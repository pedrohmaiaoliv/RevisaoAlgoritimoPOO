public class Aluno{
    String none;
    int idade;
    boolean situacao;
    double[] notas = new double[2];
    static int contador = 0;
   

    public Aluno() {
        
        contador = contador + 1;
    }
    public static int zerarContador(){
        int retorno = contador;
        contador = 0;
        return retorno;
    }
}
