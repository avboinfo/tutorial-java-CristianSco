package EEmail;


class NodoGen<T> {
    private T valore;
    private NodoGen<T> successivo;

    public NodoGen(T valore) {
        this.valore = valore;
        this.successivo = null;
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

    @Override
    public String toString() {
        return "NodoGen{" +
                "valore=" + valore +
                '}';
    }
}
