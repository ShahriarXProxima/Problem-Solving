import java.util.Scanner;

public class CanISquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int totalSquare = 0;
            for (int i = 0; i < n; i++) {
                totalSquare += input.nextInt();
            }

            double squareRoot = Math.sqrt(totalSquare);
            if (squareRoot == Math.floor(squareRoot)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
