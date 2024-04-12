package SpesaSupermercato;

import java.io.*;


public class Spesa {
    ListaGen<Prodotto> listaProdotti; // Lista dei prodotti nella spesa
    double costoTotale;

    public Spesa() {
        this.listaProdotti = new ListaGen<>();
        this.costoTotale = 0;
    }

    // Metodo per caricare il catalogo dei prodotti da un file CSV
    public void caricaCatalogoDaCSV(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                String codice = tokens[0];
                String descrizione = tokens[1];
                double costo = Double.parseDouble(tokens[2]);
                listaProdotti.addTail(new Prodotto(codice, descrizione, costo));
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Errore durante la lettura del file prodotti.csv");
        }
    }

  

 // Aggiunta del codice di un prodotto all'elenco
 public void aggiungiProdotto(String codice) {
    NodoGen<Prodotto> current = listaProdotti.getRoot();
    while (current != null) {
        if (current.getValore().codice.equals(codice)) {
            listaProdotti.addTail(current.getValore());
            costoTotale += current.getValore().costo;
            break;
        }
        current = current.getSuccessivo();
    }
}













    // Eliminazione dell'ultimo prodotto inserito nell'elenco
public void eliminaUltimoProdotto() {
    NodoGen<Prodotto> current = listaProdotti.getRoot();
    NodoGen<Prodotto> prev = null;
    while (current != null) {
        if (current.getSuccessivo() == null) {
            if (prev == null) {
                listaProdotti.setRoot(null);
            } else {
                prev.setSuccessivo(null);
            }
            costoTotale -= current.getValore().costo;
            System.out.println("Prodotto eliminato: " + current.getValore().codice + " - " + current.getValore().descrizione);
            break;
        }
        prev = current;
        current = current.getSuccessivo();
    }
}

// Eliminazione di un prodotto dall'elenco dato il suo codice
public void eliminaProdotto(String codice) {
    NodoGen<Prodotto> current = listaProdotti.getRoot();
    NodoGen<Prodotto> prev = null;
    while (current != null) {
        if (current.getValore().codice.equals(codice)) {
            if (prev == null) {
                listaProdotti.setRoot(current.getSuccessivo());
            } else {
                prev.setSuccessivo(current.getSuccessivo());
            }
            costoTotale -= current.getValore().costo;
            System.out.println("Prodotto eliminato: " + current.getValore().codice + " - " + current.getValore().descrizione);
            break;
        }
        prev = current;
        current = current.getSuccessivo();
    }
}


    // Calcola il costo totale della spesa, escludendo i prodotti eliminati
    public double calcolaCostoTotale() {
        double costoTotale = 0;
        NodoGen<Prodotto> current = listaProdotti.getRoot();
        while (current != null) {
            if (!current.getValore().eliminato) {
                costoTotale += current.getValore().costo;
            }
            current = current.getSuccessivo();
        }
        return costoTotale;
    }

    // Stampa l'elenco della spesa, escludendo i prodotti eliminati
    public void stampaListaSpesa() {
        try {
            FileWriter writer = new FileWriter("SpesaSupermercato/spesa.txt");
            NodoGen<Prodotto> current = listaProdotti.getRoot();
            while (current != null) {
                if (!current.getValore().eliminato) {
                    Prodotto prodotto = current.getValore();
                    System.out.println(prodotto.codice + ": " + prodotto.descrizione + " - €" + prodotto.costo);
                    writer.write(prodotto.toString() + "\n");
                }
                current = current.getSuccessivo();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Errore durante la scrittura del file spesa.txt");
        }
    }
}
