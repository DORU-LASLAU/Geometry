public class Main2 {
    public static void main(String[] argv) {

        Point p1= new Point(4,5);
        Point p2= new Point(6,8);
        p1.setOffset(4,4);
        p2.setOffset(4,4);

        System.out.println("P1="+p1.toString());
        System.out.println("P2="+p2.toString());
    }
}
