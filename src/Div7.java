import java.util.Scanner;

public class Div7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            if (n % 7 == 0) {
                System.out.println(n);
                continue;
            }

            String numify = Integer.toString(n);
            if (numify.length() == 1) {
                System.out.println(7);
            } else if (numify.length() == 2) {
                System.out.println(21);
            } else if (numify.length() == 3) {
                System.out.println(777);
            }
        }
    }
}
