import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String numOne = input.nextLine();
        String numTwo = input.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numOne.length(); i++) {
            {
                if (numOne.charAt(i) == numTwo.charAt(i)) {
                    result.append('0');
                    continue;
                }
                result.append('1');
            }
        }
        System.out.print(result);
    }
}
