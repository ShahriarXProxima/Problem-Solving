import java.util.Scanner;

public class BrainsPhotos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        char[][] photo = new char[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                photo[i][j] = input.next().charAt(0);
            }
        }

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (photo[i][j] == 'B' || photo[i][j] == 'W' || photo[i][j] == 'G') {
                    continue;
                }
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("#Black&White");
        } else {
            System.out.println("#Color");
        }
    }
}
