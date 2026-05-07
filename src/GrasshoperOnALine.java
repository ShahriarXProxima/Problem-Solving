import java.util.Scanner;

public class GrasshoperOnALine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int x = input.nextInt();
            int k = input.nextInt();

            if (x % k != 0) {
                System.out.println(1);
                System.out.println(x);
            } else {
                System.out.println(2);
                System.out.println(1 + " " + (x - 1));
            }
        }
    }
}
