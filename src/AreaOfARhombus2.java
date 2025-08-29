import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AreaOfARhombus2 {
    // function to calculate the area of a rhombus --> Note: the entries are integers, not floats
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length1, length2;
        System.out.println("Enter the length of the diagonals of the rhombus");

        try {
            length1 = Integer.parseInt(br.readLine());
            length2 = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("An error occurred");
            return;
        }

        if (length1 <= 0 || length2 <= 0) {
            System.out.print("Wrong input");
        }

        System.out.println("Area of Rhombus: " + (length1 * length2) / 2);
    }
}
