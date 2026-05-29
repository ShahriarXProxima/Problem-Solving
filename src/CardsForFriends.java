import java.util.Scanner;

public class CardsForFriends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int w = input.nextInt();
            int h = input.nextInt();
            int n = input.nextInt();

            int pieceCount = 1;
            while (w % 2 == 0) {
                pieceCount *= 2;
                w /= 2;
            }
            while (h % 2 == 0) {
                pieceCount *= 2;
                h /= 2;
            }

            if (pieceCount >= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}