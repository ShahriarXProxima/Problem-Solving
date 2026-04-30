import java.util.Scanner;

public class SkibidusAndAmogu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String noun = input.next();
            if (noun.equals("us")) {
                System.out.println("i");
                continue;
            }

            char[] nounArray = noun.toCharArray();
            StringBuilder nounBuilder = new StringBuilder();

            for (int i = 0; i < nounArray.length - 2; i++) {
                nounBuilder.append(nounArray[i]);
            }
            nounBuilder.append('i');

            System.out.println(nounBuilder);
        }
    }
}
