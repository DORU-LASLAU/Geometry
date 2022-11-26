public class MainPolygon {
    public static void main(String[] args) {
        Polygon p = new Polygon(new Point(1,2),
                new Point(3,5),
                new Point(2,4),
                new Point(3,8));
        System.out.println(p);
        p.setOffset(3, 4);
        System.out.println(p);
        System.out.println("Length: " + p.getLength());
    }
}