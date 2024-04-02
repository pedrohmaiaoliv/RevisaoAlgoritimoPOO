class CircunferenciaAulaCinco{

    double raio;
    static double pi;

    public CircunferenciaAulaCinco(double raio) {
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
        CircunferenciaAulaCinco c = new CircunferenciaAulaCinco(2);
        CircunferenciaAulaCinco c2 = new CircunferenciaAulaCinco(5);
        CircunferenciaAulaCinco c3 = new CircunferenciaAulaCinco(7);
        System.out.println(c.getArea());
        System.out.println(c2.getArea());
        System.out.println(c3.getArea());
    }
}