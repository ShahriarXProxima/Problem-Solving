import java.util.Scanner;

public class FoodForAnimals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int x = input.nextInt();
            int y = input.nextInt();

            int dogNeed = Math.max(0, x - a);
            int catNeed = Math.max(0, y - b);

            if (dogNeed + catNeed <= c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
