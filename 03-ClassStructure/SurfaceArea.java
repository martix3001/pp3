public class SurfaceArea {
   
    static float rectangle(float a, float b){
        return a*b;
    }
    static double circle(float r){
        return Math.PI * r * r;
    }
    static double cuboid(double a, double b,double c){
        return 2*a*b+2*a*c+2*b*c;
    }
    static double sphere(double r){
        //4 π r2
        return 4*Math.PI*r*r;
    }
    static double cone(double r,double l){
        //π r 2 + π L r
        return Math.PI*r*2+Math.PI*l*r;
    }
    
}