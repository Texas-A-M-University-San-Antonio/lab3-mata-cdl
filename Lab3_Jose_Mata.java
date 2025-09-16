 /*
Student Name: Jose Mata
Assignment: Lab 3
Date: Sept. 16, 2025
Course: CSCI-1136-60L
Instructor: Al Dungo
*/
 
 import java.util.Scanner;
 import java.text.NumberFormat;
 
 public class Lab3_Jose_Mata{


   public static void main(String[] args){
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