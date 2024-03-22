package Banca;

import java.io.*;
public class Logger {
    private static PrintWriter out;

    static {
        try {
            out = new PrintWriter(new FileWriter("Banca/Log.txt"), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void log(String message) {
        out.println(message);
    }
}