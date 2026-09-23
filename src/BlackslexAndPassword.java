import java.util.Scanner;

public class BlackslexAndPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int k = input.nextInt();
            int x = input.nextInt();

            System.out.println(k * x + 1);
        }

    }
}
