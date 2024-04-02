class Circunferencia{

    double raio;
    static double pi;

    public Circunferencia(double raio) {
        this.raio=raio;
        pi = 3.14;
    }

    public double getArea() {
        return pi*raio*raio;
    }
}

public class circular
{
    public static void main(String[] args){
        Circunferencia c = new Circunferencia(2);
        Circunferencia c2 = new Circunferencia(5);
        Circunferencia c3 = new Circunferencia(7);
        System.out.println(c.getArea());
        System.out.println(c2.getArea());
        System.out.println(c3.getArea());
    }
}