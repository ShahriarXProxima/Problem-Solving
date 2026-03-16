import java.util.Scanner;

public class DislikeOfThrees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int num = input.nextInt();
            if (num % 3 == 0 || num % 10 == 3) {
                continue;
            }
            System.out.println(num);
        }
    }
}
