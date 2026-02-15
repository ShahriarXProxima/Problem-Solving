import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numString = input.nextLine();
        int count = 0;

        for (int i = 0; i < numString.length(); i++) {
            if (numString.charAt(i) == '4' || numString.charAt(i) == '7') {
                count++;
            }
        }

        if (count == 4 || count == 7) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
