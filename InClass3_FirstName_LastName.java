/**
 * Name: [Enter Your Name Here]
 * Date: [Enter Today's Date]
* Purpose: InClass 3 - 
* [Write a description about this InClass 3 program]
 */

// Don't forget to import and declare a Scanner for user input.
 import java.util.Scanner; 
 import java.text.NumberFormat;
public class InClass3_FirstName_LastName
{
    public static void main(String[] args) 
    {
        // In-Class 3 Example:
        // Step 1: Prompt the user to enter the length of the side of a cube.
        // Step 2: Read the user's input and store it in a variable.
        // Step 3: Use an appropriate method to determine the volume of the cube.
        // Step 4: Use an appropriate method to determine the surface area of the cube.
        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method
        // Step 5: Print the volume and surface area in clear sentences.



        Scanner input = new Scanner(System.in);

        // Declare variables
        double initialValue;   // Initial value of the home
        int years;             // Number of elapsed years
        double interestRate;   // Interest rate
        double finalValue;     // Final value of the home

        // Prompt the user for inputs
        System.out.print("Enter the initial value of the home: ");
        initialValue = input.nextDouble();

        System.out.print("Enter the number of elapsed years: ");
        years = input.nextInt();

        System.out.print("Enter the interest rate (e.g., enter 6 for 6%): ");
        interestRate = input.nextDouble();

        // Convert interest rate from percentage to decimal
        interestRate = interestRate / 100.0;

        // Calculate final value using A = P * (1 + r)^t
        finalValue = initialValue * Math.pow(1 + interestRate, years);

        // Format final value as currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String formattedFinalValue = currency.format(finalValue);

        // Display result
        System.out.println("The final value of the home after " + years + 
                           " years is: " + formattedFinalValue);

        // Close the scanner
        input.close(); 
    }
}