import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String firstLetter = str.substring(0, 1).toUpperCase();
        String restString = str.substring(1);

        System.out.print(firstLetter + restString);
    }
}
