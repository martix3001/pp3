public class C6 extends Vehicle {
    //Car
     private int maxSpeed;

    public C6(int s, int maxSpeed) {
        super(s);
        this.maxSpeed = maxSpeed;
    }
    public int[] spec(){
        int[] sp = {0,0};
        sp[0] = getSeats();
        sp[1] = maxSpeed;
        return sp;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    
}
