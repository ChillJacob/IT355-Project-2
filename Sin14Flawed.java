//Jacob Spaide
//Sin 14 Flawed

import java.util.Scanner;

public class Sin14Flawed 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();

        double result = 0;

        switch (choice) 
        {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) 
                {
                    result = num1 / num2;
                } 
                else 
                {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Error: Invalid choice");
        }

        System.out.println("Result: " + result);

        scan.close();
    }
}