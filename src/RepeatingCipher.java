import java.util.Scanner;

public class RepeatingCipher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String cipher = input.next();
        StringBuilder decrypt = new StringBuilder();

        int index = 0;
        int jump = 1;
        while (cipher.length() > index) {
            decrypt.append(cipher.charAt(index));
            index += jump;
            jump++;
        }

        System.out.println(decrypt);
    }
}
