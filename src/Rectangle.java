public class Rectangle extends Point {
    private int width;
    private int height;
    public Rectangle() {
        super();
        width = 0;
        height = 0;
    }
    public Rectangle(Point p, int newWidth, int newHeight) {
        super(p.getX(), p.getY());
        width = newWidth;
        height = newHeight;
    }
    Rectangle(Segment s) {
//super();
        Point p1, p2;
        p1 = s.getStartPoint();
        p2 = s.getEndPoint();
        int minX, minY;
        minX = p1.getX();
        if (minX > p2.getX()) {
            minX = p2.getX();
        }
        minY = p1.getY();
        if (minY > p2.getY()) {
            minY = p2.getY();
        }
        moveTo(minX,minY);
        width = Math.abs(p1.getX()-p2.getX());
        height = Math.abs(p1.getY()-p2.getY());
    }
    public Rectangle(Point p1, Point p2) {
        this(p1, p2.getX() - p1.getX(), p2.getY() - p1.getY());
    }
    @Override
    public String toString() {
        return super.toString() + " width: " + width + " height = " + height;
    }
    public int getArea() {
        return width * height;
    }
    public Point getPoint() {
        return new Point(getX(), getY());
    }
    public Point getTopLeftPoint() {
        Point p = new Point(getX(),getY() + height);
        return p;
    }
    public Point getTopRightPoint() {
//Point p = new Point(getX() + width, getY() + height);
        Point p = new Point(getX(),getY());
        p.setOffset(width, height);
        return p;
    }
    public Point getBottomLeftPoint() {
        return getPoint();
    }
    public Point getBottomRightPoint() {
        Point p = new Point(getX() + width, getY());
        return p;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public void setWidth(int newWidth) {
        width = newWidth;
    }
    public void setHeight(int newHeight) {
        height = newHeight;
    }
}
