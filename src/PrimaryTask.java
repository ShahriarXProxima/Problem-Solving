import java.util.Scanner;

public class PrimaryTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String a = input.next();
            if(a.length()<=1){
                System.out.println("NO");
                continue;
            }

            if (a.charAt(0) == '1' && a.charAt(1) == '0' && a.length() > 2) {
                String rest = a.substring(2);
                if (rest.charAt(0) == '0') {
                    System.out.println("NO");
                } else {
                    int x = Integer.parseInt(rest);
                    System.out.println(x >= 2 ? "YES" : "NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}