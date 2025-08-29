import java.util.Scanner;

public class Practice {

    // a program to check if a given number is even or odd
    public static void main(String[] args) {
        // declare an integer
        int num;

        // declare a scanner
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number you want to check");

        // read the integer input and store it in num
        num = s.nextInt();

        // if-else statement
        if (num % 2 == 0) {
            System.out.println("The number " + num + " is an even number");
        } else {
            System.out.println("The number " + num + " is an odd number");
        }
    }
}