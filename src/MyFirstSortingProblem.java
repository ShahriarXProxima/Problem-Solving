import java.util.Scanner;

public class MyFirstSortingProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int x = input.nextInt();
            int y = input.nextInt();

            if (x > y) {
                x = x ^ y;
                y = x ^ y;
                x = x ^ y;
            }

            System.out.println(x + " " + y);
        }
    }
}
