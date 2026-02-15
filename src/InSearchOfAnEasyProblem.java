import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        boolean flag = false;
        int count;

        while (test-- > 0) {
            count = input.nextInt();
            if (count == 1) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.print("Hard");
        } else {
            System.out.print("Easy");
        }
    }
}
