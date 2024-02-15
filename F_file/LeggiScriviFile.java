package F_file;

import java.io.*;
public class LeggiScriviFile{
    
public void ScriviFile (String filename){
  File F= new File(filename);
  try (PrintWriter pw = new PrintWriter(F)) {
} catch (FileNotFoundException e) {

    e.printStackTrace();
}

}
public static void  main(String[]args) {
    System.out.printf( "\n programma leggiscrivifile \n" );
}

}