public class Main3 {
    public static void main(String[] args) {
        Segment s = new Segment(new Point(4,5), new Point(6,8));
        s.setOffset(4,4);
        System.out.println(s.toString());
        System.out.println("Module:"+s.module());
    }
}
