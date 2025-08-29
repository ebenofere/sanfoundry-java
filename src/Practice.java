// java program to check whether a given number is even or odd

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practice {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double num;
        System.out.println("Enter the number");

        try {
            num = Double.parseDouble(br.readLine());
        } catch (Exception e) {
            System.out.println("An error occurred");
            return;
        }

        if (num % 2 == 0) {
            System.out.println("This number is an even number");
        } else {
            System.out.println("This number is actually an odd number");
        }
    }
}