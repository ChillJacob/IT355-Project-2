//Jacob Spaide
//Sin 12 Fixed
//Information Leakage

import java.util.HashMap;
import java.util.Map;

public class Sin12Fixed 
{
    private Map<String, String> accounts;

    public Sin12Fixed() 
    {
        this.accounts = new HashMap<>();
        this.accounts.put("user1", "23");
        this.accounts.put("user2", "47");
    }

    //getter method now mitigates information leakage
    public String getAge(String username) 
    {
        //checks if the username is valid before returning the age
        if (isValidUser(username)) 
        {
            //doesn't actually return age due to new design
            return "Age information protected";
        } 
        else
        {
            return "User not found";
        }
    }

    //ensures the username exists in the accounts map
    private boolean isValidUser(String username) 
    {
        return this.accounts.containsKey(username);
    }

    public static void main(String[] args) 
    {
        Sin12Fixed fixedExample = new Sin12Fixed();
        System.out.println("Age of user1: " + fixedExample.getAge("user1"));
        System.out.println("Age of user2: " + fixedExample.getAge("user2"));

        //try to access age of a non-existent user
        System.out.println("Age of user3: " + fixedExample.getAge("user3"));
    }
}
