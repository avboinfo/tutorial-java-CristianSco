package EEmail;


class ListaGen<T> {
    private NodoGen<T> root;
    private int size;

    public ListaGen() {
        this.root = null;
        this.size = 0;
    }

    public void addTail(NodoGen<T> n) {
        if (root == null) {
            root = n;
        } else {
            NodoGen<T> tmp = root;
            while (tmp.getSuccessivo() != null) {
                tmp = tmp.getSuccessivo();
            }
            tmp.setSuccessivo(n);
        }
        size++;
    }

    public int size() {
        return size;
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




    
