import java.util.Scanner;

public class FileName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String fileName = input.next();

        int count_x = 0;
        for (int i = 0; i < n - 2; i++) {
            if (fileName.charAt(i) == 'x' &&
                    fileName.charAt(i + 1) == 'x' &&
                    fileName.charAt(i + 2) == 'x') {
                count_x++;
            }
        }
        System.out.println(count_x);
    }
}
