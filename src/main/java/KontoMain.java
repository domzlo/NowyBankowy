
public class KontoMain {
    public static void main(String[] args) {

        Konto kontoAliny = new Konto("111111111", 13000, "Kowalska");
        Konto kontoKarola = new Konto("222222222", "Kowalski");

        kontoAliny.przelew(1000);
        kontoKarola.wpłata(5000);

        System.out.println(kontoAliny.saldo);
        System.out.println(kontoKarola.saldo);

        System.out.println(kontoAliny.toString());
    }
}
