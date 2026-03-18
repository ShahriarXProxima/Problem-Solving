import java.util.Scanner;

public class TargetPractice {
    public static int n = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] board = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
                {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
                {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
                {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
                {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
                {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
                {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
                {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        int test = input.nextInt();
        while (test-- > 0) {
            int points = 0;
            for (int i = 0; i < n; i++) {
                String row = input.next();
                for (int j = 0; j < n; j++) {
                    char ch = row.charAt(j);
                    if (ch == 'X') {
                        points += board[i][j];
                    }
                }
            }

            System.out.println(points);
        }
    }
}
