

public class Nodo{

    Nodo figlio_dx;
    Nodo figlio_sx;
    double valore;

    public Nodo(Nodo figlio_dx, Nodo figlio_sx, double valore) {
        this.figlio_dx = figlio_dx;
        this.figlio_sx = figlio_sx;
        this.valore = valore;
    }

    public Nodo (double valore) {
        this(null,null,valore);
       
    }
    public Nodo getFiglio_dx() {
        return figlio_dx;
    
}
    public void setFiglio_dx(Nodo figlio_dx) {
        this.figlio_dx = figlio_dx;
    }
    public Nodo getFiglio_sx() {
        return figlio_sx;
    }
    public void setFiglio_sx(Nodo figlio_sx) {
        this.figlio_sx = figlio_sx;
    }
}