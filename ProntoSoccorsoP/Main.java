package ProntoSoccorsoP;

public class Main {
    public static void main(String[] args) {
        ProntoSoccorso prontoSoccorso = new ProntoSoccorso();
    
        prontoSoccorso.aggiungiPaziente("Giuseppe", "Giuseppe", "Rosso");

        prontoSoccorso.aggiungiPaziente("Luca", "polli", "Rosso");

        prontoSoccorso.aggiungiPaziente("Giuseppe", "poooiii", "Bianco");

       

        
        System.out.println(prontoSoccorso);
        System.out.println( prontoSoccorso.contaPazienti("Rosso")); 

    }
}
