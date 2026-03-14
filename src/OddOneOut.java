import java.util.Scanner;

public class OddOneOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            if (a == b) {
                System.out.println(c);
            } else if (b == c) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
    }
}
