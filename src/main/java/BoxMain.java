
public class BoxMain {
    public static void main(String[] args) {

        Box a = new Box(1);
        Box b = new Box(2);
        Box c = new Box(3);
        Box d = c;
        System.out.println("Wartości pierwotne:");
        System.out.println("a = " + a.x + ", b = " + b.x + ", c = " + c.x + ", d = " + d.x);

        d.x = b.x;
        System.out.println("\nWartości po działaniu 'd.x = b.x':");
        System.out.println("a = " + a.x + ", b = " + b.x + ", c = " + c.x + ", d = " + d.x);

        b.x = 9;
        c = a;
        System.out.println("\nWartości po działaniach 'b.x = 9' i 'c = a':");
        System.out.println("a = " + a.x + ", b = " + b.x + ", c = " + c.x + ", d = " + d.x);

        a.x = 7;
        System.out.println("\nWartości po działaniu 'a.x = 7':");
        System.out.println("a = " + a.x + ", b = " + b.x + ", c = " + c.x + ", d = " + d.x);

        a = null;
//        przypisanie obiektowi wartości null powoduje usunięcie referencji do tego obiektu. obietk dalej istnieje w
//        pamięci, ale nie mamy do niego ścieżki!!
        System.out.println("\nWartości po działaniu 'a = null':");
        //  System.out.println(a.x); zgodnie z powyższą uwagą nie możemy dostać się do tego obiektu więc wyskoczyłby nam błąd!
        System.out.println("b = " + b.x + ", c = " + c.x + ", d = " + d.x);

        d = b;
        System.out.println("\nWartości po działaniu 'd = b':");
        //  System.out.println(a.x); zgodnie z powyższą uwagą nie możemy dostać się do tego obiektu więc wyskoczyłby nam błąd!
        System.out.println("b = " + b.x + ", c = " + c.x + ", d = " + d.x);

        b = a;
        System.out.println("\nWartości po działaniu 'b = a':");
        System.out.println("c = " + c.x + ", d = " + d.x);




    }
}
