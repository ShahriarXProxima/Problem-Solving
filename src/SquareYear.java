import java.util.Scanner;

public class SquareYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {

            int year = input.nextInt();
            if (rootable(year)) {
                System.out.println(0 + " " + (int) Math.sqrt(year));
            } else {
                System.out.println(-1);
            }
        }
    }

    static boolean rootable(int n) {
        if (n < 0) {
            return false;
        }
        return (Math.sqrt(n) % 1 == 0);
    }
}
