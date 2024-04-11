package EEmail;

import java.util.Date;


public class Main {
    public static void main(String[] args) {
        // Creazione di una casella di posta
        Mailbox mailbox = new Mailbox();

        // Aggiunta di alcune email di esempio
        mailbox.addEmail(new Email("mittente1", "Oggetto 1", new Date(), "Testo email 1"));
        mailbox.addEmail(new Email("mittente2", "Oggetto 2", new Date(), "Testo email 2"));
        mailbox.addEmail(new Email("mittente3", "Oggetto 3", new Date(), "Testo email 3"));

        // Stampa delle email nella casella di posta
        System.out.println("Email nella casella di posta:");
        System.out.println(mailbox);

        // Ricerca di email con "Oggetto" nell'oggetto
        String searchText = "Oggetto";
        ListaGen<Email> searchResults = mailbox.searchEmailBySubject(searchText);
        System.out.println("Risultati della ricerca per '" + searchText + "':");
        System.out.println(searchResults);

        // Eliminazione della prima email
        mailbox.deleteEmail(0);
        System.out.println("Dopo l'eliminazione della prima email:");
        System.out.println(mailbox);
    }
}

