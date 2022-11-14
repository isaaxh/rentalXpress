import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AllCustomers {
   private ArrayList<Customer> customers = new ArrayList<Customer>() ;
   
   public void main(){
    getUserData();
   }

   private void storeUserData(){
    System.out.println("customer size ===>>" + customers.size());
    System.out.println("customers ===>>" + customers);
    PrintWriter writer;
    try {
        writer = new PrintWriter("Customers.txt");
        writer.print("");
        // other operations
        writer.close();
    } catch (FileNotFoundException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
    }

    for(int i = 0; i < customers.size(); i++){

        Customer currCus = customers.get(i);
        String userData = currCus.getId() + "|"  + currCus.getName() + "|" + currCus.getEmail() + "|" + currCus.getPassword();
        try {
            saveToFile(userData);
        } catch (IOException e) {
            System.out.println("could not add customer: " + currCus.getId());
            e.printStackTrace();
        }
    }
   }
 
   private void getUserData(){
    File file = new File("Customers.txt");
    Scanner s;
    try {
        s = new Scanner(file);
        while(s.hasNextLine()){
            String line = s.nextLine();
            String[] items = line.split("\\|");
            Customer currCus = new Customer(items[0], items[1], items[2], items[3]);
            customers.add(currCus);
        }
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

   }
  
   private static void saveToFile(String text) throws IOException{
    BufferedWriter outStream= new BufferedWriter(new FileWriter("Customers.txt", true));
    outStream.newLine();
    outStream.write(text);
    outStream.close();
    // FileWriter fw = new FileWriter(customers,);
    // PrintWriter pw = new PrintWriter(fw);
    // pw.println(text);
    // pw.println(text);
    // pw.println(text);
    // pw.close();
   }
   

   public ArrayList<Customer> getAllCustomers() {
       return customers;
   }

   public void addCustomer(Customer newCustomer){
    customers.add(newCustomer);
    storeUserData();
   }

   public void removeCustomer(String customerId){
    int arrSize = customers.size();
    for(int i = 0; i < arrSize; i++){
        Customer currentCus = customers.get(i);
        if(currentCus.getId().equals(customerId)){
            customers.remove(i);
        }
    }
    storeUserData();
   }

   public Customer getCustomer(String customerId){
    
    int arrSize = customers.size();
    for(int i = 0; i < arrSize; i++){
        Customer currentCus = customers.get(i);
        if(currentCus.getId().equals(customerId)){
           return currentCus; 
        }
    }
    return null;
   }


}
