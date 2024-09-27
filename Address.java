public class Address {
    private String street;
    private String city;
    private String postalCode;

    public Address() {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    public void display(){
        System.out.println("--Address Information--");
        System.out.println("Street: " + getStreet());
        System.out.println("City: " + getCity());
        System.out.println("Postal Code: " + getPostalCode());
    }
}
