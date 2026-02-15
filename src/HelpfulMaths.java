import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String exp = input.nextLine();

        String[] part = exp.split("[+]");

        Arrays.sort(part);

        System.out.print(String.join("+", part));
    }
}
