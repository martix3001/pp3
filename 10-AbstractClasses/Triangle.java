public class Triangle extends Shape {
    int a,b,c,h;

    

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double area() {
        return (a*h)/2;     
    }

    //JESTEM LENIEM I ZAKŁADAM RÓWNOBOCZNY
    @Override
    public double permeter() {
        return 3*a;
    }


    
    
}
