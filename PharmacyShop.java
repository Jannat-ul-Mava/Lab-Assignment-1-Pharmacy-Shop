import java.util.Scanner;

public class PharmacyShop {
    private Address address;
    private Medicine[] medicine;
    private int medicineCount;
    private Person person;
    public int choice;
    public String choose;

    {
        Medicine[] medicine = new Medicine[2];
        //     public Medicine(String medicineId, String batchNo, String manufacturer, Date expiryDate, int quantity, String name, double price) {
        medicine[0]=new Medicine("M001","b12","Health",new Date(24,9,2024),1,"Ali",75.0);
        medicine[1]=new Medicine("M002","b13","care",new Date(25,10,2024),2,"Ahmad",74.0);

    }


    public PharmacyShop( Person person) {
        this.address = address;
        this.medicine = medicine;
        this.medicineCount = medicineCount;
        this.person = person;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Medicine[] getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine[] medicine) {
        this.medicine = medicine;
    }

    public int getMedicineCount() {
        return medicineCount;
    }

    public void setMedicineCount(int medicineCount) {
        this.medicineCount = medicineCount;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    public void searchMedicineById(String medicineId) {
        Scanner sc= new Scanner(System.in);
        String Id = sc.nextLine();
        System.out.println("Enter medicine Id:");
        if(Id.equals(medicineId)) {
            System.out.println("Medicine is found:"+medicineId);
        }
    }

    public void searchMedicineByName(String medicineName) {
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter medicine Id:");
        if(name.equals(medicineName)) {
            System.out.println("Medicine is found:"+medicineName);
        }
    }

    public void updateMedicine(String medicineId) {

    }

    public void printTotalRevenue() {

    }

    public void findExpiredMedicine(Date date) {

    }

    public void removeMedicine(String medicineName) {

    }

    public void sellMedicine(String medicineName, int quantity) {

    }

    public void addMedicine(Medicine medicine) {

    }



    Scanner scanner = new Scanner(System.in);


     public void display() {
        System.out.println("+++++ Menu ++++++");
         System.out.println("1. Search Medicine by Id");
         System.out.println("2. Search Medicine by name");
         System.out.println("3. Display Medicine");
        System.out.println("4. Update Medicine");
        System.out.println("4. Remove Medicine");
        System.out.println("5. Sell Medicine");
        System.out.println("7. PrintTotalRevenue");
        System.out.println("8. Find expired medicine");
        System.out.println("\nPlease enter the name of the medicine");
         int choice = scanner.nextInt();
         if(choice==1) {
           //  searchMedicineById(String medicineId);
         }

    }

}
