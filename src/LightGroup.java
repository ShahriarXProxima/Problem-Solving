import java.util.Scanner;

public class LightGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int count = 0;
        while (n-- > 0) {
            int ons = input.nextInt();
            if (ons == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
