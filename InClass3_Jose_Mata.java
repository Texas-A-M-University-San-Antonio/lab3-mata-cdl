 /*
Student Name: Jose Mata
Assignment: Lab 3
Date: Sept. 16, 2025
Course: CSCI-1136-60L
Instructor: Al Dungo
*/

import java.util.Scanner;

public class InClass3_Jose_Mata{

   public static void main(String[] args){

        // Step 1: Prompt the user to enter the length of the side of a cube
        Scanner input = new Scanner(System.in);
         System.out.print("Enter the length of a side of the cube: ");

        // Step 2: Read the user's input and store it in a variable
        double side = input.nextDouble();

        // Step 3: Determine the volume of the cube (V = side^3)
        double volume = Math.pow(side, 3);

        // Step 4: Determine the surface area of the cube (A = 6 * side^2)
        double surfaceArea = 6 * Math.pow(side, 2);

        // Step 5: Print the results
        System.out.println("The volume of the cube is " + volume + " cubic units.");
        System.out.println("The surface area of the cube is " + surfaceArea + " square units.");

        input.close();

   }

}