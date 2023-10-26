public class CinemaTicket {
    static String cinemaName = "Morning Star Cinema";

    String filmTitle;
    int row;
    int seat;
    double price;

    // Constructor with movie, row, and seat as parameters
    public CinemaTicket(String filmTitle, int row, int seat) {
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        this.price = (row <= 2) ? 10.00 : 25.00;
    }

    // Custom method to display ticket details
    public String displayTicket() {
        return "Cinema Name: " + cinemaName +"\nFilm Title: " + filmTitle +"\nRow: " + row + " Seat: " + seat +"\nPrice: PLN " + price;
    }
    public static void main(String[] args) {
        // Create two CinemaTicket objects
        CinemaTicket t1 = new CinemaTicket("Gladiator", 2, 5);
        CinemaTicket t2 = new CinemaTicket("Gladiator", 7, 3);

        // Display created ticket details
        System.out.println("Ticket 1 Details:\n" + t1.displayTicket());
        System.out.println("\nTicket 2 Details:\n" + t2.displayTicket());
    }
}