public class MM {
    public static void main(String[] args) {
        Magic m = new Magic();
        m.bibbidi();
        m.bibbidi();
        m.boo();
        System.out.println(m.x);
    }
}

class Magic {
    public int x = 1;

    public void bibbidi() {
        x++;
        bobbidi();
        boo();
    }

    public void bobbidi() {
        x--;
        boo();
        boo();
    }

    public void boo() {
        x *= 2;
    }
}