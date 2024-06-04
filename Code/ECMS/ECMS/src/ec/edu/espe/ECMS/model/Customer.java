package ec.edu.espe.ECMS.model;

/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class Customer {
    private String name;
    private String lastName;
    private String address;
    private String phone;
    private String email;
    private String id;

    // Constructor
    public Customer(String name, String lastName, String address, String phone, String email, String id) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.id = id;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
