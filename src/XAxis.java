import java.util.Arrays;
import java.util.Scanner;

public class XAxis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int[] points = new int[3];
            for (int i = 0; i < 3; i++) {
                points[i] = input.nextInt();
            }

            Arrays.sort(points);
            int distance = Math.abs(points[0] - points[1]) + Math.abs(points[2] - points[1]);

            System.out.println(distance);
        }
    }
}
