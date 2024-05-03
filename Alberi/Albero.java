import java.util.*;

public class Albero {
    Nodo radice;

    public Albero(Nodo radice) {
        this.radice = radice;
    }

    public ArrayList<Nodo> toArrayList() {
    ArrayList<Nodo> lista = new ArrayList<>();
    lista.add(radice);
    int conta= 0;
    while(conta<lista.size()) {
        Nodo locale = lista.get(conta);
        if(locale.getFiglio_sx()!=null) {
            lista.add(locale.getFiglio_sx());
        }
        if(locale.getFiglio_dx()!=null) {
            lista.add(locale.getFiglio_dx());
        }
        conta++;
    }
}
    public int numeroNodi() {
        return toArrayList().size();
    }
    public String toString() {
        
        int delimitatore=1;
        int conta=0;
        String output="";
        for(Nodo nodo : lista) {


        
    }
}
