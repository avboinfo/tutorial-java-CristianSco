package LLista;

public class Main {

    public static void main(String[] args) {
        System.out.println("Partiti!");

        Lista l = new Lista();
        System.out.println(l);

       /*  for (int i = 0; i < 10; i++) {
            l.addTail(new Nodo(i, null));
        }
        l.addHead(new Nodo(2024, null));
        */

        l.addSorted(new Nodo(30, null));
        l.addSorted(new Nodo(300, null));
        l.addSorted(new Nodo(320, null));
        l.addSorted(new Nodo(330, null));
        l.addSorted(new Nodo(378, null));
        l.addSorted(new Nodo(567, null));
        l.addAfter(new Nodo(600, null), 3);
        l.removePosition(2);
        System.out.println(l);



        
        
    }

}
