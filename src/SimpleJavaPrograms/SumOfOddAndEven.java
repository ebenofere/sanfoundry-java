package SimpleJavaPrograms; // Declares the package name for organizing related classes

import java.util.Scanner; // Imports the Scanner class for reading user input from console

public class SumOfOddAndEven { // Declares a public class named SumOfOddAndEven

    public static void main(String[] args) { // Main method - entry point of the Java program
        int num, sumE = 0, sumO = 0; // Declares three integer variables: num (array size), sumE (sum of even numbers initialized to 0), sumO (sum of odd numbers initialized to 0)

        Scanner s = new Scanner(System.in); // Creates a Scanner object to read input from standard input (keyboard)

        System.out.println("Enter the number of elements: "); // Prompts user to enter how many elements they want in the array
        num = s.nextInt(); // Reads the next integer from user input and stores it in variable num

        int[] arr = new int[num]; // Creates an integer array with size equal to num (dynamic array size based on user input)

        System.out.println("Enter the elements of the array"); // Prompts user to enter the actual array elements

        for (int i = 0; i < num; i++) // For loop to read num elements from user input
        {
            arr[i] = s.nextInt(); // Reads each integer and stores it in the array at index i

        } // End of input loop

        for (int i = 0; i < num; i++) // For loop to iterate through all elements in the array
        {
            if (arr[i] % 2 == 0) { // Checks if current element is even (remainder when divided by 2 is 0)
                sumE = sumE + arr[i]; // Adds the even number to the sum of even numbers
            } else { // If the number is not even, it must be odd
                sumO = sumO + arr[i]; // Adds the odd number to the sum of odd numbers
            }
        } // End of calculation loop

        System.out.println("Sum of Even Numbers: " + sumE); // Displays the total sum of all even numbers
        System.out.println("Sum of Odd Numbers: " + sumO); // Displays the total sum of all odd numbers

        s.close(); // Closes the Scanner object to free up system resources and prevent memory leaks
    } // End of main method
} // End of class