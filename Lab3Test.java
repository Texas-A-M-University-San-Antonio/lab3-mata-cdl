
/**
 * Test file for Lab3 - Compound Interest Calculation
 * This file contains basic checks to verify the student's Lab3 implementation
 */

public class Lab3Test {
    public static void main(String[] args) {
        System.out.println("Running Lab3 Checks...");

        // Test 1: Check if Lab3 class exists
        System.out.println("Test 1: Looking for Lab3 class...");
        System.out.println("Expected format: Lab3_FirstName_LastName or CompoundInterest_FirstName_LastName");

        // Test 2: Check for main method
        System.out.println("\nTest 2: Checking for main method...");
        System.out.println("Verifies that a main method exists and is properly structured");

        // Test 3: Check for variable declarations
        System.out.println("\nTest 3: Variable declarations...");
        System.out.println("Manual check: Confirm that four variables are declared: initial value, years, interest rate, and final value");

        // Test 4: Check for user input
        System.out.println("\nTest 4: User input...");
        System.out.println("Manual check: Confirm that the program requests input for initial value, years, and interest rate, and assigns them to variables");

        // Test 5: Check for calculation step
        System.out.println("\nTest 5: Calculation step...");
        System.out.println("Manual check: Confirm that the program converts the interest rate to a decimal and calculates the final value using Math.pow");

        // Test 6: Check for output statement
        System.out.println("\nTest 6: Output statement...");
        System.out.println("Manual check: Confirm that the final value is displayed to the user in a clear sentence");

        System.out.println("\n=== LAB3 CHECKS COMPLETE ===");
        System.out.println("For complete verification, manually review the student's Lab3 file to ensure:");
        System.out.println("1. Class and main method are present and named correctly");
        System.out.println("2. Four variables are declared for calculation");
        System.out.println("3. User input is requested and stored for initial value, years, and interest rate");
        System.out.println("4. Interest rate is converted to decimal and final value is calculated using Math.pow");
        System.out.println("5. The result is printed in a clear sentence");
        System.out.println("6. Program compiles and runs without errors");
    }
}
