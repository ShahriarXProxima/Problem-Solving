import java.util.Scanner;

public class BlackboardGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            if (n % 4 == 0) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
        }
    }
}
