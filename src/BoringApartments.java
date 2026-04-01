import java.util.Scanner;

public class BoringApartments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int[] arr = {1, 2, 3, 4};
            int keyPressed = 0;
            String num = input.next();

            int range = Integer.parseInt(String.valueOf(num.charAt(0)));

            for (int i = 1; i <= range; i++) {
                for (int j = 0; j < 4; j++) {
                    keyPressed += arr[j];
                    if (i == range && arr[j] == num.length()) {
                        break;
                    }
                }
            }
            System.out.println(keyPressed);
        }
    }
}
