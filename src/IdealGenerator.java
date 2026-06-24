import java.util.Scanner;

public class IdealGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int k = input.nextInt();
            if (k % 2 == 0) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
        }
    }
}