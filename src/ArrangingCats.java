import java.util.Scanner;

public class ArrangingCats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            String s = input.next();
            String f = input.next();

            int add = 0;
            int remove = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0' && f.charAt(i) == '1') {
                    add++;
                } else if (s.charAt(i) == '1' && f.charAt(i) == '0') {
                    remove++;
                }
            }


            System.out.println(Math.max(add, remove));
        }
    }
}
