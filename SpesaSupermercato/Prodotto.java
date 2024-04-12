package SpesaSupermercato;

// File: Prodotto.java
public class Prodotto {
    String codice;
    String descrizione;
    double costo;
    boolean eliminato;

    public Prodotto(String codice, String descrizione, double costo) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.costo = costo;
        this.eliminato = false;
    }

    public String toString() {

        return codice + ": " + descrizione + " - €" + costo;
    }
}

