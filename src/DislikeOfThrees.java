import java.util.Scanner;

public class DislikeOfThrees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int k = input.nextInt();

            int count = 0;
            int num = 0;

            while (count < k) {
                num++;

                if (num % 3 != 0 && !String.valueOf(num).contains("3")) {
                    count++;
                }
            }

            System.out.println(num);
        }
    }
}
