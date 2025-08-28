import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AreaOfARhombus {
    // Function to calculate the area of a rhombus
    public static void main(String[] args) {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        double length1, length2;
        System.out.println("Enter the length of the diagonals of the rhombus");

        try {
            length1 = Double.parseDouble(br.readLine());
            length2 = Double.parseDouble(br.readLine());
        } catch (Exception e) {
            System.out.println("An error occurred");
            return;
        }

        if(length1 <= 0 || length2 <= 0) {
            System.out.println("Wrong input");
            return;
        }

        System.out.println("Area = " + (length1 * length2)/2);

    }
}