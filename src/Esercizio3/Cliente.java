package Esercizio3;

import java.time.LocalDate;

public class Cliente {
    private String codiceCliente;
    private String nomeCompleto;
    private String email;
    private LocalDate dataIscrizione;

    public Cliente(String codiceCliente, String nomeCompleto, String email, LocalDate dataIscrizione){
        this.codiceCliente=codiceCliente;
        this.nomeCompleto=nomeCompleto;
        this.email=email;
        this.dataIscrizione=dataIscrizione;
    }

    @Override
    public String toString(){
        return "Cliente: " + nomeCompleto;
    }
}
