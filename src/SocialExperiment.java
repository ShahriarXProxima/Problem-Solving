import java.util.Scanner;

public class SocialExperiment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            if (n == 2) {
                System.out.println(2);
            } else if (n == 3) {
                System.out.println(3);
            } else if (n > 3 && n % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
}
