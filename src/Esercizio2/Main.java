package Esercizio2;

public class Main {
    public static void main(String[] args) {

        //creo la SIM
        SIM sim = new SIM("3346271914");


        // creo le chiamate
        Chiamata c1 = new Chiamata("3302937190", 10);
        Chiamata c2 = new Chiamata("3452712914", 5.50);
        Chiamata c3 = new Chiamata("3421877194", 7);
        Chiamata c4 = new Chiamata("2611038295", 2);
        Chiamata c5 = new Chiamata("6472891532",4.7);

        // compongo l'array
        Chiamata[] chiamate = { c1,c2,c3,c4,c5};

        // passo l'array alla SIM

        sim.setListaChiamate(chiamate);
        sim.stampaDatiSIM();


    }

}
