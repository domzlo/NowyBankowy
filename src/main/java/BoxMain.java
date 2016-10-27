
public class BoxMain {
    public static void main(String[] args) {

        Box a = new Box(1);
        Box b = new Box(2);
        Box c = new Box(3);
        Box d = c;
        System.out.println("Wartości pierwotne:");
        System.out.println(a.x);
        System.out.println(b.x);
        System.out.println(c.x);
        System.out.println(d.x);

        d.x = b.x;
        System.out.println("Wartości b i d po pierwszej zmianie:");
        System.out.println(b.x);
        System.out.println(d.x);

        b.x = 9;
        c = a;
        System.out.println("Wartości a, b i c po drugiej zmianie:");
        System.out.println(a.x);
        System.out.println(b.x);
        System.out.println(c.x);

        a.x = 7;
        System.out.println("Wartość a po trzeciej zmianie:");
        System.out.println(a.x);
        a = null;
        System.out.println("Wartość a po czwartej zmianie:");

        System.out.println("Wartości ostateczne:");
        System.out.println(a.x);
        System.out.println(b.x);
        System.out.println(c.x);
        System.out.println(d.x);

    }
}
