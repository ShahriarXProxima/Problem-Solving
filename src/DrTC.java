import java.util.Scanner;

public class DrTC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            String num = input.next();

            int oneCount = 0;
            for (char ch : num.toCharArray()) {
                if (ch == '1') {
                    oneCount++;
                }
            }

            int totalOnes = oneCount * (n - 1) + (n - oneCount);
            System.out.println(totalOnes);
        }
    }
}
