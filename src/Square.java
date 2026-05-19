import java.util.ArrayList;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int maxX = Integer.MIN_VALUE;
            int minX = Integer.MAX_VALUE;

            for (int i = 0; i < 4; i++) {
                int x = input.nextInt();
                int y = input.nextInt();

                if (x < minX) {
                    minX = x;
                }
                if (x > maxX) {
                    maxX = x;
                }
            }

            int sideLength = maxX - minX;

            System.out.println(sideLength * sideLength);


        }
    }

}
