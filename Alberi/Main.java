
public class Main {
    public static void main(String[] args) {
    
        Nodo radice= new Nodo(10);

        Nodo pippo= new Nodo(3);
        Nodo pluto= new Nodo(5);
        radice.setFiglio_dx(pippo);
        radice.setFiglio_sx(pluto);

        System.out.println(radice);
}


}
