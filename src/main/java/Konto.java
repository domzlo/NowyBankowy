import java.math.BigDecimal;

public class Konto {

    String numerKonta;
    int saldo;
    String właścicielNazwisko;

    public Konto(String numerKonta, int saldo, String właścicielNazwisko) {
        this.numerKonta = numerKonta;
        this.saldo = saldo;
        this.właścicielNazwisko = właścicielNazwisko;
    }

    public Konto(String numerKonta0, String właścicielNazwisko0) {
        this.numerKonta = numerKonta;
        this.właścicielNazwisko = właścicielNazwisko;
        saldo = 0;
    }

    public void wpłata(int kwotaWpłaty) {
        saldo += kwotaWpłaty;
    }

    public void przelew(int kwotaPrzelewu) {
        saldo = saldo - kwotaPrzelewu;
    }

    public String toString () {
        return "Właścicielem konta jest Pan/i " + właścicielNazwisko + ". Numer konta to: " + numerKonta +
        ", a stan środków na koncie wynosi: " + saldo + ".";
        }
}
