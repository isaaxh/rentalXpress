package HelperClasses;

import java.io.Serializable;
import java.util.UUID;

public class Customer implements Serializable {

    private String name;
    private String email;
    private String password;
    private String userId;

    public Customer(String aEmail, String aaPassword) {
        email = aEmail;
        password = aaPassword;
    }

    public Customer(String aUserId, String aName, String anEmail, String aPassword) {
        name = aName;
        email = anEmail;
        password = aPassword;
        userId = aUserId;

    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String aEmail) {
        email = aEmail;
    }

    public String getId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String aPassword) {
        password = aPassword;
    }

    public Boolean checkPassword(String aPassword) {
        if (aPassword.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

}
