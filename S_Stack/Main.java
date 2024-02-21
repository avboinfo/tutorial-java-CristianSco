/*
** Esempio di uso di uno Stack (Pila)
** Sandro Gallo - 08/02/2024
*/

/*

public class Main {

    public static void main( String[] args ) {
        Stack<String> s = new Stack<>();
        s.push("Juve");
        s.push("Inter");
        System.out.println(s.pop());
        System.out.println(s);
    }

}
*/

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        File inputFile = new File("input.txt");
        Scanner scanner = new Scanner(inputFile);

       
        Stack<String> stack = new Stack<>();

        // Leggere le frasi 
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            stack.push(line);
        }

        
        scanner.close();

        //  file di output
        File outputFile = new File("output.txt");
        PrintWriter writer = new PrintWriter(outputFile);

       
        while (true) {
            String line = stack.pop();
            if (line == null) // Stack vuoto
                break;
            writer.println(line);
        }

      
        writer.close();
    }
}



