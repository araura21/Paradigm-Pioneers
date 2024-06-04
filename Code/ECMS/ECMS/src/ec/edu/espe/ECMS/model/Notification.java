package ec.edu.espe.ECMS.model;

/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class Notification {
    private int notificationID;
    private String type;
    private String message;
    private String frequency;
    private String content;

    public Notification(int notificationID, String type, String message, String frequency, String content) {
        this.notificationID = notificationID;
        this.type = type;
        this.message = message;
        this.frequency = frequency;
        this.content = content;
    }

    public void sendNotification() {
        System.out.println("Notification sent: " + message);
    }

    // Getters and Setters
    public int getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(int notificationID) {
        this.notificationID = notificationID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
