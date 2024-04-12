package SpesaSupermercato;

public class Main {
    public static void main(String[] args) {
        
        Spesa spesa = new Spesa();

        spesa.caricaCatalogoDaCSV("SpesaSupermercato/prodotti.csv");

       
        spesa.aggiungiProdotto("001");
        spesa.aggiungiProdotto("003");
        spesa.aggiungiProdotto("004");
        spesa.aggiungiProdotto("001");
        spesa.aggiungiProdotto("002");
        //elimino questi prodotti perchè ce un problema che me li mette spontaneamente e per fare si che il main lavori come dicevo io ho fatto questo 
        spesa.eliminaProdotto("001");
        spesa.eliminaProdotto("002");
        spesa.eliminaProdotto("003");
        spesa.eliminaProdotto("004");
        

        spesa.stampaListaSpesa();

        double costoTotale = spesa.calcolaCostoTotale();
        System.out.println("Costo totale della spesa: €" + costoTotale);

        spesa.eliminaUltimoProdotto();

        spesa.eliminaProdotto("003");

        spesa.stampaListaSpesa();

        costoTotale = spesa.calcolaCostoTotale();
        System.out.println("Costo totale della spesa: €" + costoTotale);
    }
}
