import java.util.Scanner;

public class EasyProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            System.out.println(n - 1);
        }
    }
}
