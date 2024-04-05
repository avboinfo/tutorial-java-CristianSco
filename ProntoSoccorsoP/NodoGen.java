package ProntoSoccorsoP;

public class NodoGen<T> {
    private T valore ;
    private NodoGen<T> successivo;

    public NodoGen(T valore) {
        this.valore = valore;
        this.successivo = null;
    }

    public String toString() {
        return "il mio valore è " +valore;
    }
    
    public T getValore() {
        return valore;
    }

    public void setValore(T valore) {
        this.valore = valore;
    }

    public NodoGen<T> getSuccessivo() {
        return successivo;
    }

    public void setSuccessivo(NodoGen<T> successivo) {
        this.successivo = successivo;
    }



}