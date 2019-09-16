public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);
        System.out.println(MyPoint.distance(p1, p2));
        System.out.println(MyPoint.distance(0, 0, 10, 30.5));
    }
}