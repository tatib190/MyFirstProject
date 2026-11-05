# MyFirstProject
Project for Java Class
# Lab: Movie Ticket Calculator
This program calculates the total cost of movie tickets. It then calculates the total price of based on the number of tickets.
## How to Run
1. Open the program in your IDE
2. Enter the name of movie and the cost of each ticket individually, then put in the number of tickets bought.
3. Calculate the total ticket cost.

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
        MovieTicket ticket = new MovieTicket("Obsession", 14.99);

        // TODO D2: Call calculateTotalCost(3)
        double totalCost = ticket.calculateTotalCost(3);

        // TODO D3: Print the result
        System.out.println("Total Cost: $" + totalCost);
    }
}

## Example Output
movieName: Obsession

pricePerTicket: 14.99

numberOfTickets: 3

Total Cost: $44.97
## Author
Tatiana Ballesteros


#### Edit added by [zeromoore]

## Collaborated Awknowledgement
This project was reviewed and edited by Zero Moore on GitHub. 
