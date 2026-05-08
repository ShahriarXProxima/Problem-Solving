import java.util.Scanner;

public class CanISquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            Long totalSquare = 0L;
            for (int i = 0; i < n; i++) {
                totalSquare += input.nextLong();
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
