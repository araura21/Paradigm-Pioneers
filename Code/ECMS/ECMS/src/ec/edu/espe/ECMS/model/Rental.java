package ec.edu.espe.ECMS.model;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class Rental {
    private int rentalID;
    private Customer customer;
    private Computer computer;
    private LocalDateTime startRental;
    private LocalDateTime endRental;
    private double rate;

    public Rental(int rentalID, Customer customer, Computer computer, double rate) {
        this.rentalID = rentalID;
        this.customer = customer;
        this.computer = computer;
        this.rate = rate;
        this.startRental = LocalDateTime.now();
    }

    public void endRental() {
        this.endRental = LocalDateTime.now();
    }

    public double calculateUsageTime() {
        if (endRental == null) {
            endRental();
        }
        Duration duration = Duration.between(startRental, endRental);
        return duration.toHours() + (duration.toMinutes() % 60) / 60.0;
    }

    public String generateSummary() {
        return "Rental Summary: ID - " + rentalID + ", Customer - " + customer.getName();
    }

    public void notifyCompletion() {
        System.out.println("Rental completed for customer: " + customer.getName());
    }

    // Getters and Setters
    public int getRentalID() {
        return rentalID;
    }

    public void setRentalID(int rentalID) {
        this.rentalID = rentalID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public LocalDateTime getStartRental() {
        return startRental;
    }

    public void setStartRental(LocalDateTime startRental) {
        this.startRental = startRental;
    }

    public LocalDateTime getEndRental() {
        return endRental;
    }

    public void setEndRental(LocalDateTime endRental) {
        this.endRental = endRental;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
