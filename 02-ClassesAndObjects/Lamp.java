public class Lamp {
    
    boolean lampStatus;

    void turnOn(){
        lampStatus = true;
    }
    void turnOff(){
        lampStatus = false;
    }
    void displayLampStatus(){
        String status = lampStatus ? "on" : "off";  
        System.out.println("The lamp is "+status); 
    }
    public static void main(String[] args) {
        Lamp l1 = new Lamp(); 
        Lamp l2 = new Lamp();

        l1.turnOn();
        l2.turnOff();
        l1.displayLampStatus();
        l2.displayLampStatus();
    }
}
