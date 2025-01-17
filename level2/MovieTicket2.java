import java.util.Scanner;
// create class Movie ticket
class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber ="";
        this.price = 0.0;
    }

    // Method to book a ticket (assign seat and update price)
    public void bookTicket(String seatNumber) {
        this.seatNumber = seatNumber;
        this.price =  getPriceForMovie(movieName);
        System.out.println("Ticket booked successfully!");
    }

    private double getPriceForMovie(String movieName) {
        // Dynamically set the price based on the movie
        switch (movieName.toLowerCase()) {
            case "avengers":
                return 250.0;
            case "spider-man":
                return 220.0;
            case "joker":
                return 180.0;
            case "barbie":
                return 210.0;
            default:
                return 200.0;  // Default price for other movies
        }
    }
    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: Rs" + price);
    }

    // Getter methods for the attributes
    public String getMovieName() {
        return movieName;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }
}

public class MovieTicket2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("available movies are: avengers,spider-man,joker,barbie");
        // Ask the user for movie details
        System.out.println("Enter Movie Name:");
        String movieName = input.nextLine();

        // Create a new MovieTicket object (initially no seat booked)
        MovieTicket obj = new MovieTicket(movieName, "", 0.0);

        // Ask for seat booking
        System.out.println("Enter Seat Number to book:");
        String seatNumber = input.nextLine();
        
        // Book the ticket
        obj.bookTicket(seatNumber);

        // Display the ticket details
        System.out.println("\n--- Ticket Details ---");
        obj.displayTicketDetails();
        
        input.close();
    }
}
