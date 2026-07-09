import java.util.Scanner;

public class WhereIsTheBishop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();

        while (test-- > 0) {
            String[] board = new String[8];
            for (int i = 0; i < 8; i++) {
                board[i] = input.next();
            }

            boolean found = false;

            for (int i = 0; i < 7 && !found; i++) {
                for (int j = 0; j <= 5; j++) {
                    if (board[i].charAt(j) == '#'
                            && board[i].charAt(j + 1) == '.'
                            && board[i].charAt(j + 2) == '#') {
                        System.out.print((i + 2) + " " + (j + 2));
                        found = true;
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
}