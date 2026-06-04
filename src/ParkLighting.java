import java.util.Scanner;

public class ParkLighting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();

            int result = ((n * m) + 1) / 2;

            System.out.println(result);
        }
    }
}
