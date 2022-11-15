import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import HelperClasses.Customer;

public class Runner {
   public static void main(String[] args) throws ClassNotFoundException {
    ObjectInputStream in;
    try {
        in = new ObjectInputStream(new FileInputStream("Customers.txt"));
        Customer c1 = (Customer) in.readObject();
        System.out.println(c1.checkPassword("121"));
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

   } 
}
