package Esercizio2;

public class SIM {
    private String numeroDiTelefono;
    private double creditoDisponibile;
    private Chiamata[] listaChiamate;

    // costruttore
    public SIM(String numeroDiTelefono) {
        this.numeroDiTelefono=numeroDiTelefono;
        this.creditoDisponibile=0;
        this.listaChiamate=new Chiamata[5];
    }

    // metodo

    public void setListaChiamate(Chiamata[] listaChiamate) {
        this.listaChiamate = listaChiamate;
    }

    public void stampaDatiSIM(){
        System.out.println("Numero di telefono: " + numeroDiTelefono);
        System.out.println("Credito disponinile: " + creditoDisponibile);
        System.out.println("Ultime chiamate effettuate:");
        for (Chiamata chiamata : listaChiamate) { // questo è il for each
            if (chiamata != null) {
                System.out.println("Numero chiamato: " + chiamata.getNumeroChiamato());
                System.out.println("Durata chiamata: " + chiamata.getDurataChiamata() + " min");
            }
        }

    }

}
