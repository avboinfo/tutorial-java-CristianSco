package ProntoSoccorsoP;

public class ListaGen<T> {
    NodoGen<T> root;

    public ListaGen() {
        this.root = null;
    }

    public void addTail(T v) {
        addTail(new NodoGen<T>(v));
    }

    public void addTail(NodoGen<T> n) {
        if (root == null) {
            root = n;
        } else {
            NodoGen<T> tmp = root;
            while (tmp.getSuccessivo() != null) tmp = tmp.getSuccessivo();
            tmp.setSuccessivo(n);
        }
    }

    public void addHead( NodoGen<T> n){
        if (root == null) {
            root = n;
        } else {
            NodoGen<T> tmp = root;
            n.setSuccessivo( tmp );
            tmp = n;
        }

    }

    

    public String toString() {
        String s = "Elementi della lista: ";
        NodoGen<T> p = root;
        while (p != null) {
            s += p + " \n";
            p = p.getSuccessivo();
        }
        s += "End!\n";
        return s;
    }

    public NodoGen<T> getRoot() {
        return root;
    }

    public void setRoot(NodoGen<T> root) {
        this.root = root;
    }
}


