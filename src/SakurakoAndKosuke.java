import java.util.Scanner;

public class SakurakoAndKosuke {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            if (n % 2 == 0) {
                System.out.println("Sakurako");
            } else {
                System.out.println("Kosuke");
            }
        }
    }
}
