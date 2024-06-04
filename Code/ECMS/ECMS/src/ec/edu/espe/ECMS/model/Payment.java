package ec.edu.espe.ECMS.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class Payment {
    private int paymentID;
    private Customer customer;
    private String paymentMethod;
    private double amount;
    private Date paymentDate;

    public Payment(int paymentID, Customer customer, String paymentMethod, double amount, Date paymentDate) {
        this.paymentID = paymentID;
        this.customer = customer;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public void registerPayment() {
        // Implementation to register payment
    }

    public double calculateAmount() {
        return amount;
    }

    public String generateReceipt() {
        return "Receipt: " + paymentID + ", Amount: " + amount;
    }

    public List<Payment> showPaymentHistory(Customer customer) {
        // Implementation to show payment history
        return null;
    }

    public String generateFinancialReport(Date start, Date end) {
        // Implementation to generate financial report
        return "Financial Report";
    }

    // Getters and Setters
    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}
