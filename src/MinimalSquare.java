import java.util.Scanner;

public class MinimalSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();

            int side1 = Math.max(2 * a, b);
            int side2 = Math.max(a, 2 * b);
            int side3 = a + b;

            int minSide = Math.min(side1, Math.min(side2, side3));
            int minimalAreaSquare = minSide * minSide;

            System.out.println(minimalAreaSquare);
        }
    }
}
