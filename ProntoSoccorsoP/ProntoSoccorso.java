package ProntoSoccorsoP;

public class ProntoSoccorso {
    private ListaGen<Paziente> listaPazienti;

    public ProntoSoccorso() {
        this.listaPazienti = new ListaGen<>();
    }

    public void aggiungiPaziente(String nome, String cognome, String livelloUrgenza) {
        Paziente nuovoPaziente = new Paziente(nome, cognome, livelloUrgenza);
        if(livelloUrgenza.equals("Bianco")){
        listaPazienti.addTail(nuovoPaziente);
        }
        else if(livelloUrgenza.equals("Rosso")){
            listaPazienti.addHead(nuovoPaziente);
           
        }

          

    }

    public Paziente recuperaPazienteUrgente() {
        NodoGen<Paziente> nodoPaziente = listaPazienti.getRoot();
        Paziente pazienteUrgente = nodoPaziente.getValore();
        listaPazienti.setRoot(nodoPaziente.getSuccessivo());
        return pazienteUrgente;
    }

    public int contaPazienti(String livelloUrgenza) {
        int conteggio = 0;
        NodoGen<Paziente> nodoPaziente = listaPazienti.getRoot();
        while (nodoPaziente != null) {
            if (nodoPaziente.getValore().getLivelloUrgenza().equals(livelloUrgenza)) {
                conteggio++;
            }
            nodoPaziente = nodoPaziente.getSuccessivo();
        }
        return conteggio;
    }

    public void eliminaPaziente(String nome, String cognome) {
        NodoGen<Paziente> nodoPaziente = listaPazienti.getRoot();
        NodoGen<Paziente> nodoPrecedente = null;
        while (nodoPaziente != null) {
            Paziente paziente = nodoPaziente.getValore();
            if (paziente.getNome().equals(nome) && paziente.getCognome().equals(cognome)) {
                if (nodoPrecedente == null) {
                    listaPazienti.setRoot(nodoPaziente.getSuccessivo());
                } else {
                    nodoPrecedente.setSuccessivo(nodoPaziente.getSuccessivo());
                }
                break;
            }
            nodoPrecedente = nodoPaziente;
            nodoPaziente = nodoPaziente.getSuccessivo();
        }
    }


    
public String toString() {
    String s = "Pazienti in attesa: \n";
    NodoGen<Paziente> p = listaPazienti.getRoot();
    while (p != null) {
        Paziente paziente = p.getValore();
        s += "Nome: " + paziente.getNome() + ", Cognome: " + paziente.getCognome() + ", Livello di urgenza: " + paziente.getLivelloUrgenza() + "\n";
        p = p.getSuccessivo();
    }
    return s;
}

}
