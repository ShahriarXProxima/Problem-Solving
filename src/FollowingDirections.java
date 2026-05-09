import java.util.Scanner;

public class FollowingDirections {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int x = 0, y = 0;
            int n = input.nextInt();
            String directions = input.next();
            boolean flag = false;

            for (int i = 0; i < n; i++) {
                if (directions.charAt(i) == 'U') {
                    y++;
                } else if (directions.charAt(i) == 'D') {
                    y--;
                } else if (directions.charAt(i) == 'R') {
                    x++;
                } else if (directions.charAt(i) == 'L') {
                    x--;
                }

                if (x == 1 && y == 1) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
