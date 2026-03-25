import java.util.Scanner;

public class Buttons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            int annaTotal = a + (c + 1) / 2;
            int katieTotal = b + c / 2;

            if (annaTotal > katieTotal) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
    }
}
