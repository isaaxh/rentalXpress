import java.util.ArrayList;

public class AllCustomers {
   private ArrayList<Customer> customers = new ArrayList<Customer>() ;
   
   public ArrayList<Customer> getAllCustomers() {
       return customers;
   }

   public void addCustomer(Customer newCustomer){
    customers.add(newCustomer);
   }

   public void removeCustomer(String customerId){
    int arrSize = customers.size();
    for(int i = 0; i < arrSize; i++){
        Customer currentCus = customers.get(i);
        if(currentCus.getId().equals(customerId)){
            customers.remove(i);
        }
    }
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
