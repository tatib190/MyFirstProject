//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class MovieTicket {

    // ===== Part A: Class Definition =====
    String movieName;
    double pricePerTicket;

    // ===== Part B: Constructor (With Parameters) =====
    MovieTicket(String movieName, double pricePerTicket) {
        this.movieName = movieName;
        this.pricePerTicket = pricePerTicket;

    }

    // ===== Part C: Method (With Parameter & Return) =====
    double calculateTotalCost(int numberOfTickets) {
        return pricePerTicket * numberOfTickets;
    }
}

public class Main {
    public static void main(String[] args) {

        // ===== Part D: Object Creation & Method Calls =====

        // TODO D1: Create one MovieTicket object
        MovieTicket ticket = new MovieTicket("Avatar", 12.5);

        // TODO D2: Call calculateTotalCost(3)
        double totalCost = ticket.calculateTotalCost(3);

        // TODO D3: Print the result
        System.out.println("Total Cost: $" + totalCost);
    }
}