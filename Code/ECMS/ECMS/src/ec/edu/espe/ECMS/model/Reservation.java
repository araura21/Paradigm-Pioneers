package ec.edu.espe.ECMS.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class Reservation {
    private int reservationID;
    private Customer customer;
    private Computer computer;
    private Date reservationDate;
    private Date reservationTime;

    public Reservation(int reservationID, Customer customer, Computer computer, Date reservationDate, Date reservationTime) {
        this.reservationID = reservationID;
        this.customer = customer;
        this.computer = computer;
        this.reservationDate = reservationDate;
        this.reservationTime = reservationTime;
    }

    public void registerReservation() {
        // Implementation to register reservation
    }

    public void modifyReservation(Date newDate, Date newTime) {
        this.reservationDate = newDate;
        this.reservationTime = newTime;
    }

    public void cancelReservation() {
        // Implementation to cancel reservation
    }

    public boolean checkAvailability(Date date, Date time) {
        // Implementation to check availability
        return true;
    }

    public List<Reservation> showReservationHistory(Customer customer) {
        // Implementation to show reservation history for a specific customer
        return null;
    }

    // Getters and Setters
    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
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

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Date getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(Date reservationTime) {
        this.reservationTime = reservationTime;
    }
}
