public class Circle extends Shape {
    int r;
    

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double area() {
        return r*r*Math.PI;
    }
    @Override
    public double permeter() {
        return 2*r*Math.PI;
    }
}
