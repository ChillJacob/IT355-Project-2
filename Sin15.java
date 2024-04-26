//Jacob Spaide
//Sin 15
//Not Updating Easily

/*
 * automatically checks for updates and makes it easy for the user to update
 */

import java.util.Scanner;
public class Sin15 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome easy update app!");

        //automatically check for updates
        if (checkForUpdates()) 
        {
            System.out.println("New updates are available. Would you like to install them? (Y/N)");
            String response = scan.nextLine();
            if (response.equalsIgnoreCase("Y")) 
            {
                //install updates performed
                installUpdates();
                System.out.println("Updates installed successfully.");
            }
        }

        scan.close();
    }

    private static boolean checkForUpdates() 
    {
        //assuming updates are available
        return true;
    }

    private static void installUpdates() 
    {
        System.out.println("Installing updates...");
        //updates here
    }
}