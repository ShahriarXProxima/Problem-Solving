import java.util.Scanner;

public class OneDEraser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            String paper = input.next();

            int opt = 0;
            int i = 0;
            while (i < n) {
                if (paper.charAt(i) == 'B') {
                    opt++;
                    i += k;
                } else {
                    i++;
                }
            }

            System.out.println(opt);
        }
    }
}
