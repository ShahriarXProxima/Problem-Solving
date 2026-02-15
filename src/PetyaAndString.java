import java.util.Scanner;

public class PetyaAndString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = input.nextLine();
        String str2 = input.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.compareTo(str2) == 0) {
            System.out.print(0);
        } else if (str1.compareTo(str2) < 0) {
            System.out.print(-1);
        } else {
            System.out.print(1);
        }
    }
}
