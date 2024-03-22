import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Raccolta {

    ArrayList <Videogame> Lista;
    public Raccolta(String File) {
        
        File f = new File(File);
        
        try {
            Scanner fileInput = new Scanner(f);
            while (fileInput.hasNextLine()) {
                String linea = fileInput.nextLine();
                String[] dati = linea.split(";");
                Videogame videogame = new Videogame(dati[0], dati[1],Float.parseFloat(dati[2]),Integer.parseInt(dati[3]));
                Lista.add(videogame);
            }

            fileInput.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public String toString() {
        String s = "Contenuto della pila:\n";
        for (int i=0; i<Lista.size(); i++) {
            s += Lista.get(i) + "\n";
        }
        return s;
    }
}
    

