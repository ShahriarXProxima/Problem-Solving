import java.util.Scanner;

public class PhoneDesktop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int x = input.nextInt();
            int y = input.nextInt();

            int screenArea = 0;

            while (x > 0 || y > 0) {
                screenArea++;

                int yPlaced = Math.min(y, 2);
                y -= yPlaced;
                int emptySlot = 15 - (yPlaced * 4);

                int xPlaced = Math.min(x, emptySlot);
                x -= xPlaced;
            }

            System.out.println(screenArea);
        }
    }
}
