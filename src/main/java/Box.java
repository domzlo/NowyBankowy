
public class Box {

    public int x;

    public Box(int x0) {
        x = x0;
    }

    static void mutate(int aa, Box bb, Box cc, int[] tt) {
        aa +=1;
        bb.x += 1;
        cc = new Box(cc.x + 1);
        tt[0] +=1;
    }
}
