import java.util.Scanner;

public class PrependAndAppend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();

        while (test-- > 0) {
            int n = input.nextInt();
            String num = input.next();

            int firstCharacter = 0;
            int lastCharacter = n - 1;

            while (firstCharacter < lastCharacter && num.charAt(firstCharacter) != num.charAt(lastCharacter)) {
                firstCharacter++;
                lastCharacter--;
            }
            System.out.println(lastCharacter - firstCharacter + 1);
        }

    }
}
