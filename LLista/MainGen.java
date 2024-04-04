package LLista;

public class MainGen {
    public static void main( String[] args ){
        NodoGen<String> n = new NodoGen<>("forza juve");

        System.out.println(n);

        NodoGen<Double> n2 = new NodoGen<>(5.3);
        System.out.println(n2);

        NodoGen<Integer> n3 = new NodoGen<>(10);
        System.out.println(n3);

        ListaGen<String> ls = new ListaGen<>();
        ls.addTail("siumm");
        ls.addTail("forza juve");
        ls.addTail("giulietta");



    }
}
 