package LLista;

public class Lista {


    class Iteratore{

        private Nodo nodo;

        private Iteratore(Nodo nodo) {
            this.nodo = nodo;
        }
        public boolean hasNext() {
            return nodo!=null;
        }
        public Nodo next() {
            if(nodo==null) return null;
            //Nodo result = new Nodo(nodo.getValore(), nodo.getSuccessivo());
            Nodo result = nodo;
            nodo = nodo.getSuccessivo();
            return result;   //nodo che restituiamo una copia
        }
    }

    Nodo radice;

    public Lista() {
    
        radice = null;     
           
    }
        public Iteratore getIterator(){

            Iteratore i = new Iteratore(radice);
            return i;

        }

        

        
    

    public boolean isEmpty() {
        return radice==null;
    }

    public void addTail( Nodo n ) {
        if (isEmpty()) {
            radice = n;
        } else {
            Nodo p = radice;
            while (p.getSuccessivo()!=null) p = p.getSuccessivo();
            p.setSuccessivo( n );
        }
    }

    public void addHead( Nodo n){
        if (isEmpty()) {
            radice = n;
        } else {
            n.setSuccessivo( radice );
            radice = n;
        }

    }
    public void addSorted(Nodo n){  // mette in ordine i numeri che gli diamo guarda il precedente e il successivo 

        if (isEmpty()) {
            radice=n;
            n.setSuccessivo(null);
            return;
        } 
        
        
        int vn = n.getValore();
        if (vn<radice.getValore()) {
            n.setSuccessivo(radice);
            radice =n ;
            return;
        }
        Nodo p1 = radice;
        Nodo p2 = radice.getSuccessivo();
        while ( p2!=null && p2.getValore()<vn) {
            p1 = p2;
            p2 = p1.getSuccessivo();
        }
        n.setSuccessivo(p2);
        p1.setSuccessivo(n);
    }

   /* public boolean addAfter(Nodo n, int pos) {   senza iteratore
        if (isEmpty()) {
            return false;
        } 
        Nodo p1 = radice;
        Nodo p2 = radice.getSuccessivo();
        int i=0;
        while ( p2!=null && i<pos-1) {
            p1 = p2;
            p2 = p1.getSuccessivo();
            i++;
        }
        if( i!=pos-1 ) { // se supera la lunchezza della lista
            return false;
        }
        n.setSuccessivo(p2);
        p1.setSuccessivo(n);
        return true;


    }
     */
    public boolean addAfter(Nodo n, int pos){  //con iteratore
        //aggiunge il nodo n solo dopo aver oltrepassato il nodo di indice
        Iteratore iter= getIterator();
        int i;
        Nodo npos=null; // nodo posizione
        for(i=0; i<pos; i++){
            if(iter.hasNext())npos=iter.next();
            else return false;
        }
        n.setSuccessivo(npos.getSuccessivo());
        npos.setSuccessivo(n);
        return true;


    }

    public boolean removePosition(int pos){
      
        if (isEmpty()){
            return false;
        }
        Nodo p1 = radice;
        Nodo p2 = radice.getSuccessivo();
        for(int i=0; i<=pos || p1.getSuccessivo()==null; i++){
            p2 = p1.getSuccessivo();
            p1 = p2;
               }
               p1.setSuccessivo(p2.getSuccessivo());
                return true;

    }
    public boolean removValue(int valore) {
        if (isEmpty()) {
            return false;
        }
        return true;
    }

    


        
         




           
            


    
    public String toString() {
        String s = "Elementi della lista: ";
        Nodo p = radice;
        while (p!=null) {
            s += p + " ";
            p = p.getSuccessivo();
        }
        s += "End!\n";
        return s;
    }
}