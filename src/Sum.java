import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();

        while (test-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            if ((a == b + c) || (b == c + a) || (c == b + a)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
