import java.util.Scanner;

public class Translation {
    static String stringReverse(String str) {
        if (str.length() == 1) {
            return str;
        }
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            temp = str.charAt(i) + temp;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = input.nextLine();
        String str2 = input.nextLine();
        str2 = stringReverse(str2);

        if (str1.compareTo(str2) == 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

    }
}
