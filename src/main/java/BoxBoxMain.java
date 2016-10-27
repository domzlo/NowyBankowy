
public class BoxBoxMain {
    public static void main(String[] args) {

        int a = 10;
        Box b = new Box(20);
        Box c = new Box(30);
        int[] t = {50};

        Box.mutate(a, b, c, t);

        System.out.println("\na = " + a + ",\nb = " + b + ", a zawartość Box b to: " + b.x + ",\nc = " +
                c + ", a zawartość Box c to: " + c.x + ",\nt = " + t + ", a wartość pierwszego argumentu w tablicy t to: " + t[0]);
    }
}