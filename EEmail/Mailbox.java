package EEmail;





public class Mailbox {
    private ListaGen<Email> emailList;

    public Mailbox() {
        this.emailList = new ListaGen<>();
    }

    public void addEmail(Email email) {
        emailList.addTail(new NodoGen<>(email));
    }

    public void deleteEmail(int index) {
        if (index < 0 || index >= emailList.size()) {
            throw new IndexOutOfBoundsException("Indice non valido");
        }
        NodoGen<Email> current = emailList.getRoot();
        if (index == 0) {
            emailList.setRoot(current.getSuccessivo());
        } else {
            for (int i = 0; i < index - 1; i++) {
                current = current.getSuccessivo();
            }
            current.setSuccessivo(current.getSuccessivo().getSuccessivo());
        }
    }

    public ListaGen<Email> searchEmailBySubject(String searchText) {
        ListaGen<Email> result = new ListaGen<>();
        NodoGen<Email> current = emailList.getRoot();
        while (current != null) {
            if (current.getValore().getOggetto().contains(searchText)) {
                result.addTail(new NodoGen<>(current.getValore()));
            }
            current = current.getSuccessivo();
        }
        return result;
    }

    @Override
    

    public String toString() {
        StringBuilder result = new StringBuilder("Email nella casella di posta:\n");
        NodoGen<Email> current = emailList.getRoot();
        while (current != null) {
            result.append("Mittente: ").append(current.getValore().getMittente())
                    .append(", Oggetto: ").append(current.getValore().getOggetto()).append("\n");
            current = current.getSuccessivo();
        }
        return result.toString();
    }

}
