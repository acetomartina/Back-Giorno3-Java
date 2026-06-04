package Esercizio3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(
                "C001",
                "Martina Aceto",
                "martina@email.it",
                LocalDate.now()
        );

        Articolo a1 = new Articolo("A001", "Computer", 799.99, 10);
        Articolo a2 = new Articolo("A002", "Monitor", 179.90, 15);

        Articolo[] articoli = new Articolo[2];
        articoli[0] = a1;
        articoli[1] = a2;

        Carrello carrello = new Carrello(cliente,articoli);
        System.out.println(cliente);
        System.out.println("Totale carrello: " + carrello.getTotaleCostoArticoli());
    }
}
