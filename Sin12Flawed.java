//Jacob Spaide
//Sin 12 Flawed

import java.util.HashMap;
import java.util.Map;

public class Sin12Flawed 
{

    private Map<String, String> accounts;

    public Sin12Flawed() 
    {
        this.accounts = new HashMap<>();
        this.accounts.put("user1", "23");
        this.accounts.put("user2", "47");
    }

    //getter designed with age not being sensitive information
    public String getAge(String username) 
    {
        return this.accounts.get(username);
    }

    public static void main(String[] args) 
    {
        Sin12Flawed example = new Sin12Flawed();
        System.out.println("Age of user1: " + example.getAge("user1"));
        System.out.println("Age of user2: " + example.getAge("user2"));
        System.out.println("Age of user2: " + example.getAge("user3"));
    }
}