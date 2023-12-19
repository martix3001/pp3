public class Test {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 6);
        System.out.println(r1.area());
        System.out.println(r1.permeter());

        Circle c1 = new Circle(5);
        System.out.println(c1.area());
        System.out.println(c1.permeter());

        Triangle t1 = new Triangle(5, 2);
        System.out.println(t1.area());
        System.out.println(t1.permeter());
    }
}
