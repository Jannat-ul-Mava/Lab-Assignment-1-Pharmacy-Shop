public class Medicine {
    private String medicineId;
    private String batchNo;
    private String manufacturer;
    private Date expiryDate;
    private int quantity;
    private String name;
    private double price;

    public Medicine(String medicineId, String batchNo, String manufacturer, Date expiryDate, int quantity, String name, double price) {
        this.medicineId = medicineId;
        this.batchNo = batchNo;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void displayMedicine() {
        System.out.println("Medicine ID: " + medicineId);
        System.out.println("Batch No: " + batchNo);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Quantity: " + quantity);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);

    }

}
