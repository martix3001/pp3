public class InternetDevice {
    String name;
    boolean connected;
    static int connectedDevices = 0;

    InternetDevice(String name) {
        this.name = name;
        this.connected = false;
    }
    void connect() {
        if (!connected) {
            connected = true;
            connectedDevices++;
        }
    }
    void disconnect() {
        if (connected) {
            connected = false;
            connectedDevices--;
            }
        }
    boolean isConnected() {
        return connected;
    }
    void displayStatus() {
        System.out.print("Device Name: " + name +" and ");
        System.out.println("Connected to the Internet: " + connected);
    }
    static void displayConnections() {
        System.out.println("Number of Devices Connected to the Internet: " + connectedDevices);
    }    

    public static void main(String[] args) {
        InternetDevice pc = new InternetDevice("Personal Computer");
        InternetDevice tablet = new InternetDevice("Tablet");
        InternetDevice smartphone = new InternetDevice("Smartphone");
        InternetDevice radio = new InternetDevice("Internet Radio");
        InternetDevice tv = new InternetDevice("Internet TV");
        pc.displayStatus();
        pc.connect();
        pc.displayStatus();
        tablet.connect();
        smartphone.connect();

        System.out.println("Device Status:");

        pc.displayStatus();
        tablet.displayStatus();
        smartphone.displayStatus();
        radio.displayStatus();
        tv.displayStatus();

        InternetDevice.displayConnections();
    }
}
