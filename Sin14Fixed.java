//Jacob Spaide
//Sin 14 Fixed
//Poor Usability

/*
 * Usability was increased by:
 * guiding user to input valid choice (1-4)
 * input validation to ensure valid choices and numbers were entered
 * usage of methods for better readability and maintainability
 */

import java.util.Scanner;
public class Sin14Fixed 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator!");
        System.out.println("Please select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1-4): ");
        int choice = getValidChoice(scan);

        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();

        double result = calculate(choice, num1, num2);

        if (!Double.isNaN(result)) 
        {
            System.out.println("Result: " + result);
        }

        scan.close();
    }

    private static int getValidChoice(Scanner scan) 
    {
        int choice;
        while (true) 
        {
            if (scan.hasNextInt()) 
            {
                choice = scan.nextInt();
                if (choice >= 1 && choice <= 4) 
                {
                    break;
                } 
                else 
                {
                    System.out.print("Invalid choice. Please enter a number between 1 and 4: ");
                }
            } 
            else 
            {
                System.out.print("Invalid input. Please enter a number between 1 and 4: ");
                //clear invalid input
                scan.next(); 
            }
        }
        return choice;
    }

    private static double calculate(int choice, double num1, double num2) 
    {
        switch (choice) 
        {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                if (num2 != 0) 
                {
                    return num1 / num2;
                } 
                else 
                {
                    System.out.println("Error: Cannot divide by zero");
                    return Double.NaN;
                }
            default:
                System.out.println("Error: Invalid choice");
                return Double.NaN;
        }
    }
}