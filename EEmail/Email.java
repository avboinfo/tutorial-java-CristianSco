package EEmail;





import java.util.Date;

class Email {
    private String mittente;
    private String oggetto;
    private Date dataOra;
    private String testo;

    public Email(String mittente, String oggetto, Date dataOra, String testo) {
        this.mittente = mittente;
        this.oggetto = oggetto;
        this.dataOra = dataOra;
        this.testo = testo;
    }

    public String getMittente() {
        return mittente;
    }

    public void setMittente(String mittente) {
        this.mittente = mittente;
    }

    public String getOggetto() {
        return oggetto;
    }

    public void setOggetto(String oggetto) {
        this.oggetto = oggetto;
    }

    public Date getDataOra() {
        return dataOra;
    }

    public void setDataOra(Date dataOra) {
        this.dataOra = dataOra;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    @Override
    public String toString() {
        return "Email{" +
                "mittente='" + mittente + '\'' +
                ", oggetto='" + oggetto + '\'' +
                ", dataOra=" + dataOra +
                ", testo='" + testo + '\'' +
                '}';
    }
}
