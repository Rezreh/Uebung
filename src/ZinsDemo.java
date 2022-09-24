public class ZinsDemo {
    public static void main(String[] args) {
        double konto = 5063.21;
        double zinsen = 0.75;

       // System.out.print("Die Zinsen am Ende des Jahres betragen : ");
       // System.out.printf("%5.2f%n",konto*(zinsen/100));
        
        System.out.println("Die Zinsen am Ende des Jahres betragen : "+ zinsrechner(100,0.05));
        System.out.println("Die Zinsen am Ende des Jahres betragen : "+ zinsrechner(2543.4,0.15));
        System.out.println("Die Zinsen am Ende des Jahres betragen : "+ zinsrechner(14680.45,0.043));
        System.out.println("Die Zinsen am Ende des Jahres betragen : "+ zinsrechner(100,1.15));
    }

    public static double zinsrechner(double konto, double zinssatz)
    {
        double zinsen = 0.0;
            zinsen=konto*zinssatz/100;
        return zinsen;
    }

}
