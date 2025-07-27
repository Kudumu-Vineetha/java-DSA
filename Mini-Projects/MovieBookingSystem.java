abstract class Movie {
    String movieId;
    String title;
    double ticketPrice;
    int numberOfTickets;

    Movie(String id, String name, double price, int tickets) {
        movieId = id;
        title = name;
        ticketPrice = price;
        numberOfTickets = tickets;
    }

    abstract double calculatePrice();

    void displayDetails() {
        System.out.println("\nMovie Record");
        System.out.println("ID: " + movieId);
        System.out.println("Title: " + title);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        if (numberOfTickets > 6) {
            System.out.println("Booking Failed: Cannot book more than 6 tickets");
        } else {
            double total = calculatePrice();
            System.out.println("Total Price: " + total);
        }
    }
}

class TeluguMovie extends Movie {
    TeluguMovie(String id, String name, double price, int tickets) {
        super(id, name, price, tickets);
    }

    double calculatePrice() {
        double total = ticketPrice * numberOfTickets;
        return total + (total * 0.05);
    }
}

class HindiMovie extends Movie {
    HindiMovie(String id, String name, double price, int tickets) {
        super(id, name, price, tickets);
    }

    double calculatePrice() {
        double total = ticketPrice * numberOfTickets;
        double discount = total * 0.10;
        double afterDiscount = total - discount;
        return afterDiscount + (afterDiscount * 0.05);
    }
}

class EnglishMovie extends Movie {
    EnglishMovie(String id, String name, double price, int tickets) {
        super(id, name, price, tickets);
    }

    double calculatePrice() {
        double total = (ticketPrice+50)*numberOfTickets;
        return total + (total * 0.05);
    }
}

public class MovieBookingSystem {
    public static void main(String[] args) {
        Movie m1 = new TeluguMovie("M101", "RRR", 150, 3);
        Movie m2 = new HindiMovie("M102", "Pathaan", 200, 2);
        Movie m3 = new EnglishMovie("M103", "Avatar", 250, 7);

        Movie[] movies = { m1, m2, m3 };

        for (Movie movie : movies) {
            movie.displayDetails();
        }
    }
}

