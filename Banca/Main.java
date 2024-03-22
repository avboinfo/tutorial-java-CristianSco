package Banca;

public class Main {
    public static void main(String[] args) {
        ContoBancario contoDiGiulietta = new ContoBancario("Giulietta", 0);
        contoDiGiulietta.deposita(2000);
        contoDiGiulietta.preleva(500);
        contoDiGiulietta.preleva(400);
        contoDiGiulietta.visualizzaSaldo();

        ContoBancario contoDiRomeo = new ContoBancario("Romeo", 0);
        contoDiGiulietta.bonifico(contoDiRomeo, 200);
        contoDiRomeo.applicaInteresse(10);
        contoDiRomeo.visualizzaSaldo();

        System.out.println("Saldo di Giulietta: €" + contoDiGiulietta.getSaldo());
        System.out.println("Saldo di Romeo: €" + contoDiRomeo.getSaldo());

    }
}