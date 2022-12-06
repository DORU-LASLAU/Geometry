public class Main4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r);
        r.moveTo(4, 7);
        System.out.println(r);
        Rectangle r2 = new Rectangle(new Point(1,1), 8, 6);
        System.out.println(r2);
        Rectangle r3 = new Rectangle(new Point(2,2), new Point(5, 8));
        System.out.println(r3);
        System.out.println(r3.getPoint().toString());
        Rectangle r4 = new Rectangle(new Point(5,6), 10, 8);
        System.out.println(r4);
        System.out.println("Top-Left: " + r4.getTopLeftPoint() +
                " Top-Right: " + r4.getTopRightPoint() +
                " Bottom-Left: " + r4.getBottomLeftPoint() +
                " Bottom-right: " + r4.getBottomRightPoint());
    }
}
