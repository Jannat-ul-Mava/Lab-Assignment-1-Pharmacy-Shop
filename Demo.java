import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Person p1=new Person("Jannat", "0345");
        //Address a=new Address("78u","rey","87lj");
        PharmacyShop p=new PharmacyShop( p1);


        p.display();
    }
}
