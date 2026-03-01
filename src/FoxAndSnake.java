import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print('#');
                }
            } else {
                if (i % 4 == 1) {
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print('.');
                    }
                    System.out.print('#');
                } else {
                    System.out.print('#');
                    for (int j = 1; j < m; j++) {
                        System.out.print('.');
                    }
                }
            }
            System.out.println();
        }
    }
}
