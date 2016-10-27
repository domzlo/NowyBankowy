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
        this.numerKonta = numerKonta0;
        this.właścicielNazwisko = właścicielNazwisko0;
        saldo = 0;
    }

    public void wpłata(int kwotaWpłaty) {
        saldo += kwotaWpłaty;
    }

    public void przelewNa(int kwotaPrzelewu, Konto kontoOdbiorcy) {
        kontoOdbiorcy.saldo = kontoOdbiorcy.saldo + kwotaPrzelewu;
        this.saldo = this.saldo - kwotaPrzelewu;
    }
//    this.saldo odnosi się do salda konta, na którym wykonujemy tą metodę!!!

    public String toString () {
        return "Właścicielem konta jest Pan/i " + właścicielNazwisko + ". Numer konta to: " + numerKonta +
        ", a stan środków na koncie wynosi: " + saldo + ".";
        }
}
