package F_file;

import java.io.*;
public class LeggiScriviFile{
    
public void ScriviFile (String filename){
  File f= new File(filename);
  try {
    PrintWriter pw = new PrintWriter(f)
  ;
    for(int i=0;i<10;i++){
        pw.printf( "%.2f %.2f /n", Math.random()*10, Math.random()*10 );
    
    }
    pw.close();

    
} catch (FileNotFoundException e) {

    e.printStackTrace();
}

}
public static void  main(String[]args) {
    System.out.printf( "\n programma leggiscrivifile \n" );
    LeggiScriviFile lsf = new LeggiScriviFile();
    lsf.ScriviFile("F_File/LeggiScriviFile.txt");
}

}