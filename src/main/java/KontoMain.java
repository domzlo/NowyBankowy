
public class KontoMain {
    public static void main(String[] args) {

        Konto kontoAliny = new Konto("111111111", 13000, "Kowalska");
        Konto kontoKarola = new Konto("222222222", 12, "Kowalski");

        kontoAliny.przelewNa(1000, kontoAliny, kontoKarola);
        kontoKarola.wpłata(5000);


        System.out.println(kontoAliny.saldo);
        System.out.println(kontoKarola.saldo);

        System.out.println(kontoAliny.toString());
    }
}
