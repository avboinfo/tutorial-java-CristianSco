public class Videogame {
    String nome,marca;
    float costo;
    int annoproduzione;

    

public   Videogame (String nome,String marca,float costo,int annoproduzione){
this.costo= costo;
this.marca = marca;
this.nome = nome;
this.annoproduzione = annoproduzione;

}


public String toString( String nome , int annoproduzione) {

return "nome: " + nome + ", annoproduzione: " + annoproduzione;

}

}




