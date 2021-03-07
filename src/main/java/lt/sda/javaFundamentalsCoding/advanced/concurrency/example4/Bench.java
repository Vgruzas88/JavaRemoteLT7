package lt.sda.javaFundamentalsCoding.advanced.concurrency.example4;

public class Bench {

    private int availableSeats;

    public Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void takeASeat() {
        if (availableSeats > 0) {
            System.out.println("Tale a seat");
            availableSeats--;
            System.out.println("Available seats: " + availableSeats);
        } else {
            System.out.println("Sorry, there are no seats available.");
        }
    }
}

