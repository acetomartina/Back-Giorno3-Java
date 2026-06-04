package Esercizio3;

public class Carrello {
    private Cliente cliente;
    private Articolo[] articoli;
    private double totaleCostoArticoli;

    public Carrello(Cliente cliente, Articolo[] articoli){
        this.cliente=cliente;
        this.articoli=articoli;
        totaleCostoArticoli=0;
        for (Articolo articolo : articoli){
            totaleCostoArticoli = totaleCostoArticoli + articolo.getPrezzo();
        }
    }

    public double getTotaleCostoArticoli(){
        return totaleCostoArticoli;
    }
}
