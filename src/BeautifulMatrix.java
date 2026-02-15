import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] mat = new int[5][5];
        int x = 0, y = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = input.nextInt();
                if (mat[i][j] == 1) {
                    x = i + 1;
                    y = j + 1;
                }

            }
        }

        int totalMoves = Math.abs(3 - x) + Math.abs(3 - y);
        System.out.print(totalMoves);

    }
}
