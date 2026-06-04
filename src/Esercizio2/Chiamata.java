package Esercizio2;

public class Chiamata {
    private String numeroChiamato;
    private double durataChiamata;

    // costruttore
    public Chiamata(String numeroChiamato, double durataChiamata){
        this.numeroChiamato=numeroChiamato;
        this.durataChiamata=durataChiamata;
    }

    // metodi
    public String getNumeroChiamato(){
        return numeroChiamato;
    }

    public double getDurataChiamata(){
        return durataChiamata;
    }
}
