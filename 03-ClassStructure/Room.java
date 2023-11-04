public class Room {
    int number;
    int beds;
    boolean occupied;
    String guestName;

    Room(int number) {
        this.number = number;
        this.beds = 2; 
        this.occupied = false;
    }
    Room(int number, int beds) {
        this.number = number;
        this.beds = beds;
        this.occupied = false;
    }
    void checkin(String guestName) {
        if (!occupied) {
            this.guestName = guestName;
            occupied = true;
        }
    }
    void checkout() {
        if (occupied) {
            guestName = null;
            occupied = false;
        }
    }
    boolean isOccupied() {
        return occupied;
    }
    void displayStatus() {
        if (occupied) {
            System.out.println("Room Number: "+number+" Beds: "+beds+" Guest Name: " + guestName);
        } else {
            System.out.println("Room Number: "+number+" Beds: "+beds+" Status: Vacant");
        }
    }
      
    static void displaySingeRoom(){
        
    }
    static void displayAllRooms(){

    }
    static void displayRoomWithBed(){

    }
    public static void main(String[] args) {
        Room[] rooms = new Room[6];
        rooms[0] = new Room(11);
        rooms[1] = new Room(12);
        rooms[2] = new Room(13);
        rooms[3] = new Room(21, 3);
        rooms[4] = new Room(22, 3);
        rooms[5] = new Room(31, 3);
        //rooms[1].displayStatus();
        
        /*for (int i = 0; i< rooms.length;i++) {
        //    rooms[i].displayStatus();
        }  

        for(int i = 0; i< rooms.length;i++) {
            if(rooms[i].getBeds() == 2){
                rooms[i].displayStatus();
            }
        }*/
    }   
}

