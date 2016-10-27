
public class KontoMain {
    public static void main(String[] args) {

        Konto kontoAliny = new Konto("111111111", 13000, "Kowalska");
        Konto kontoKarola = new Konto("222222222", 12, "Kowalski");

        KontoOprocentowane kontoAsi = new KontoOprocentowane("111111111", 13000, "Kowalska");
        KontoOprocentowane kontoJarka = new KontoOprocentowane("222222222", 1000, "Kowalski");

//        System.out.println("Saldo początkowe Aliny i Karola: \n konto Aliny: " + kontoAliny.saldo +
//        "\n konto Karola: " + kontoKarola.saldo +"\n");
//
//        kontoAliny.przelewNa(1000, kontoKarola);
//        kontoKarola.wpłata(5000);
//        kontoKarola.przelewNa(1000, kontoKarola);
//
//        System.out.println("\n" + "Saldo końcowe Aliny i Karola: \n konto Aliny: " + kontoAliny.saldo +
//                "\n konto Karola: " + kontoKarola.saldo + "\n");

//        System.out.println(kontoAliny.toString());


        System.out.println(kontoJarka.wyliczOdsetki(5));
    }
}
