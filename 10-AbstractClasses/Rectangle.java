public class Rectangle extends Shape {
    int a,b;

    
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a*b;      
    }

    @Override
    public double permeter() {

        return 2*a+2*b;
    }
    
    
}
