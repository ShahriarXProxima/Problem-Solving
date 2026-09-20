import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RobustBVA {
    static boolean isEligible(int age) { // Checks if one person can vote
        return age >= 18 && age <= 80;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        ArrayList<Integer> ageBoundaryValues = new ArrayList<>(
                List.of(
                        age - 1,
                        age,
                        age + 1,
                        (age + 80) / 2,
                        79,
                        80,
                        80 + 1
                )
        );

        for (int x : ageBoundaryValues) {
            boolean result = isEligible(x);
            String eligibility = result ? "Eligible" : "Not eligible";
            System.out.println("Age: " + x + ", Eligibility: " + eligibility);
        }
    }
}
