import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int k = input.nextInt(), x = input.nextInt();

            while (k-- > 0) {
                x *= 2;
            }
            System.out.println(x);
        }
    }
}
