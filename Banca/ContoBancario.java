package Banca;

public class ContoBancario {
    private String nome;
    private double saldo;

    public ContoBancario(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void deposita(double importo) {
        saldo += importo;
        Logger.log(nome + " ha depositato €" + importo);
    }

    public void preleva(double importo) {
        if (saldo >= importo) {
            saldo -= importo;
            Logger.log(nome + " ha prelevato €" + importo);
        } else {
            Logger.log("Saldo insufficiente per " + nome);
        }
    }

    public void bonifico(ContoBancario destinatario, double importo) {
        if (saldo >= importo) {
            saldo -= importo;
            destinatario.deposita(importo);
            Logger.log(nome + " ha effettuato un bonifico di €" + importo + " a " + destinatario.nome);
        } else {
            Logger.log("Saldo insufficiente per il bonifico da " + nome + " a " + destinatario.nome);
        }
    }

    public void applicaInteresse(double tasso) {
        saldo -= saldo * tasso / 100;
        Logger.log("Interesse del " + tasso + "% applicato a " + nome);
    }

    public void visualizzaSaldo() {
        Logger.log("Il saldo di " + nome + " è €" + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}
