import java.util.Scanner;

public class StairPeakOrNeither {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            if (a < b && b < c) {
                System.out.println("STAIR");
            } else if (a < b && b > c) {
                System.out.println("PEAK");
            } else {
                System.out.println("NONE");
            }
        }
    }
}
