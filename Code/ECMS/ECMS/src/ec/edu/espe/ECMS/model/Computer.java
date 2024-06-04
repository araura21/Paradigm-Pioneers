package ec.edu.espe.ECMS.model;

public class Computer {
    private int id;
    private String status;
    private int timeUsage;

    public Computer(int id, String status) {
        this.id = id;
        this.status = status;
        this.timeUsage = 0;
    }

    public void registerStartRental() {
        this.status = "In Use";
    }

    public void registerEndRental() {
        this.status = "Available";
    }

    public double calculateRate(double hourlyRate) {
        return hourlyRate * (timeUsage / 60.0);
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTimeUsage() {
        return timeUsage;
    }

    public void setTimeUsage(int timeUsage) {
        this.timeUsage = timeUsage;
    }
}
