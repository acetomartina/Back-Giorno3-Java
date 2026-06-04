package Esercizio1;

public class Rettangolo {
        private double altezza;
        private double larghezza;


        // costruttore
        public Rettangolo(double altezza, double larghezza) {
            this.altezza=altezza;
            this.larghezza=larghezza;
        }

        // metodi
    public double getArea(){
            return altezza * larghezza;
    }

    public double getPerimetro(){
            return (altezza + larghezza) * 2;
    }

    public static void stampaRettangolo(Rettangolo r1){
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimetro: " + r1.getPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2){
            stampaRettangolo(r1);
            stampaRettangolo(r2);
            double sommaAree = r1.getArea() + r2.getArea();
            double sommaPerimetro = r1.getPerimetro() + r2.getPerimetro();
        System.out.println("Somma aree: " + sommaAree);
        System.out.println("Somma perimetri: " + sommaPerimetro);

    }
}
