import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String code = input.nextLine();

        code = code.replace("--", "2");
        code = code.replace("-.", "1");
        code = code.replace(".", "0");

        System.out.print(code);
    }
}