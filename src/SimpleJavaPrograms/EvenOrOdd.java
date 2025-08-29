package SimpleJavaPrograms;
import java.util.Scanner;

// A simple program  to check if a given number is even or odd
public class EvenOrOdd {
    // This is the entry point where the program starts executing
    public static void main(String[] args) {
        // num is declared as an integer variable to store the user's input
        int num;

        // A Scanner object s is created to read from standard input (keyboard)
        Scanner s = new Scanner(System.in);

        // The program prompts the user to enter a number
        System.out.println("Enter the number you want to check");

        // s.nextInt() reads the integer input and stores it in num
        num = s.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number " + num + " is an even number");
        } else {
            System.out.println("The number " + num + " is an odd number");
        }
    }
}

//Comment: The program is straightforward and demonstrates basic concepts like user input, conditional statements, and the modulus operator for determining even/odd numbers.