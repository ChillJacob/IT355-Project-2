//Jacob Spaide
//Sin 11 Fixed
//Failure to Handle Errors Correctly

import java.util.Scanner;

public class Sin11Fixed 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        //ensure no negative number can be entered
        //this prevents misinterpretation of errors and provides clear feedback to the user
        if (number < 0) 
        {
            System.out.println("Error: Cannot calculate the square root of a negative number.");
        } 
        else 
        {
            double result = calculateSquareRoot(number);
            System.out.println("Square root of " + number + " is: " + result);
        }

        scan.close();
    }

    public static double calculateSquareRoot(int number) 
    {
        //impossible for negative number to be entered into Math.sqrt() because 
        //input is validated before this function call
        return Math.sqrt(number);
    }
}