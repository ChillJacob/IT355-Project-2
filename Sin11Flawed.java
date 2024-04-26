//Jacob Spaide
//Sin 11 Flawed

import java.util.Scanner;

public class Sin11Flawed 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        double result = calculateSquareRoot(number);
        System.out.println("Square root of " + number + " is: " + result);

        scan.close();
    }

    public static double calculateSquareRoot(int number) 
    {
        //if the user enters a negative number, Math.sqrt() will return not a number
        //because this program does not handle this error case explicitly
        //this scenario could confuse a user
        return Math.sqrt(number);
    }
}