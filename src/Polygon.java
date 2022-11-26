public class Polygon {
    private Point[] points;

    public Polygon(Point...points) {
        this.points=points;
    }
    // or     public Polygon(Point[] points) {
    //        this.points=points;
    //    }

    public Polygon() {
        points=null;
    }

    public String toString() {
        String s = "" + points[0];
        for (int i = 1; i < points.length; i++) {
            s += "-" + points[i].toString();
        }
        return s;
    }

    public double getLength() {
        double length=0;
        for (int i = 0; i<points.length; i++) {
            Segment s = new Segment (points[i], points[i+1]);
            length+=s.module();
        }
        Segment s = new Segment(points[points.length - 1], points[0]);
        length += s.module();
        return length;
    }

    public void setOffset(int offX, int offY) {
        for (Point p: points) {
            p.setOffset(offX, offY);
        }
    }
}
