import java.util.Scanner;

public class PlusOrMinus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();

        while (test-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            if (a + b == c) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }
    }
}
