
public class KontoOprocentowane {

    String numerKonta;
    int saldo;
    String właścicielNazwisko;
    int odsetki;
    int oprocentowanie;

    public KontoOprocentowane(String numerKonta, int saldo, String właścicielNazwisko) {
        this.numerKonta = numerKonta;
        this.saldo = saldo;
        this.właścicielNazwisko = właścicielNazwisko;
    }

    public KontoOprocentowane(String numerKonta0, String właścicielNazwisko0) {
        this.numerKonta = numerKonta0;
        this.właścicielNazwisko = właścicielNazwisko0;
        saldo = 0;
    }

    public void wpłata(int kwotaWpłaty) {
        saldo += kwotaWpłaty;
    }

    public void przelewNa(int kwotaPrzelewu, KontoOprocentowane kontoOdbiorcy) {

        if (this != kontoOdbiorcy) {
            kontoOdbiorcy.saldo = kontoOdbiorcy.saldo + kwotaPrzelewu;
            this.saldo = this.saldo - kwotaPrzelewu;
        } else {
            System.out.println("Nie możesz przelać pieniędzy na własne konto!");
        }
    }

    public int wyliczOdsetki (int oprocentowanie) {
        this.oprocentowanie = oprocentowanie;
        odsetki = (saldo * oprocentowanie / 100);
        return saldo += odsetki;
        }


    public String toString () {
        return "Właścicielem konta jest Pan/i " + właścicielNazwisko + ". Numer konta to: " + numerKonta +
                ", a stan środków na koncie wynosi: " + saldo + "." + "\n Osetki wynoszą: " + odsetki;
    }
}
