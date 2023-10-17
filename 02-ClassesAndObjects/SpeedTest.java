public class SpeedTest {
    public static void main(String[] args) {
        int speed = 120;
        boolean valid;
        if(speed >= 40 && speed <= 140){
            valid = true;
        }else{
            valid = false;
        }
        System.out.println("Speed is "+speed+"\nand speed is valid? "+valid);

    }
}
