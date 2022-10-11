public class 两点线段最短 {
    public static void main(String[] args) {
        Point p1 = new Point(3,4);
        Point p2 = new Point(4,5);
        double v = Point.movePoint(p1, p2);
        System.out.println(v);
    }
}
class Point{
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static double movePoint(Point p1,Point p2){
        return  Math.sqrt(Math.pow(p1.x - p2.x,2) + Math.pow(p1.y - p2.y,2));
    }
}