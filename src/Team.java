import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int problems;
        problems = input.nextInt();

        int[][] arr = new int[problems][3];
        for (int i = 0; i < problems; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        int count = 0, flag = 0;
        for (int i = 0; i < problems; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 1) {
                    flag++;
                }
            }
            if (flag >= 2) {
                count++;
            }
            flag = 0;
        }
        System.out.print(count);

    }
}
