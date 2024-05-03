

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
    public double getValore() {
        return valore;
    }
    public void setValore(double valore) {
        this.valore = valore;
    }
    public String toString() {

      
        return String.valueOf(valore);

        
        
        /*return "Nodo{" +
                "figlio_dx=" + figlio_dx +
                ", figlio_sx=" + figlio_sx +
                ", valore=" + valore +
                '}';
    */
    }  
    
    boolean eFoglia(){
        return (figlio_dx==null && figlio_sx==null);
    }

}