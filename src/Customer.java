import java.io.Serializable;
import java.util.UUID;

public class Customer implements Serializable {
   private String name;
   private String email;
   private String password;
   private String userId = UUID.randomUUID().toString();

   public Customer (String aName, String anEmail, String aPassword) {
    name = aName;
    email = anEmail;
    password = aPassword;

   }

  public String getName(){
    return name;
  } 

  public String getEmail(){
    return email; 
  } 

  public String getId(){
    return userId;
  }

  public Boolean checkPassword(String aPassword){
    if(aPassword.equals(password)) {
        return true;
    } else {
        return false;
    }
  }

}
