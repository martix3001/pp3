public class Rectangle {
     double lenghtA;
     double lenghtB;
     
     void displayRectangleData(){
        double area =lenghtA * lenghtB;
        double perimeter = 2* (lenghtA + lenghtB);

        System.out.println("Rectangle is "+lenghtA+"x"+lenghtB+"and perimeter and area are "+perimeter+" "+area);
     }
    
    
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.lenghtA = 3;
        r1.lenghtB = 4;
        r2.lenghtA = 2;
        r2.lenghtB = 7;

        r1.displayRectangleData();
        r2.displayRectangleData();
    }
}
