import java.util.Scanner;

public class ExtremelyRound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int num = input.nextInt();
            int count = 0;

            for (int i = 1; i <= num; i++) {
                String numString = Integer.toString(i);
                if (numString.length() == 1) {
                    count++;
                    continue;
                }
                boolean flag = true;
                for (int j = 1; j < numString.length(); j++) {
                    if (numString.charAt(j) != '0') {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
