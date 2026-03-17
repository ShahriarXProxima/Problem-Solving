import java.util.Scanner;

public class Minimize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(b - a);
        }
    }

}
