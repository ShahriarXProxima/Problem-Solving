import java.util.Scanner;

public class RightMaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();

            int operation = 0;
            int MaxNum = 0;

            for (int i = 0; i < n; i++) {
                int num = input.nextInt();
                if (num >= MaxNum) {
                    MaxNum = num;
                    operation++;
                }
            }

            System.out.println(operation);
        }
    }
}
