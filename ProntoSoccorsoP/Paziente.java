package ProntoSoccorsoP;



class Paziente  {
    private String nome;
    private String cognome;
    private String livelloUrgenza;

    public Paziente(String nome, String cognome, String livelloUrgenza) {
        this.nome = nome;
        this.cognome = cognome;
        this.livelloUrgenza = livelloUrgenza;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getLivelloUrgenza() {
        return livelloUrgenza;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setLivelloUrgenza(String livelloUrgenza) {
        this.livelloUrgenza = livelloUrgenza;
    }

    

   
    public int compareTo(Paziente altroPaziente) {
        return this.livelloUrgenza.compareTo(altroPaziente.getLivelloUrgenza());
    }
}
