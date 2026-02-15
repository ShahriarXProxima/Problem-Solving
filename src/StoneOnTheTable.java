import java.util.Scanner;

public class StoneOnTheTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String color = input.nextLine();
        int count = 0;

        for (int i = 0; i < color.length() - 1; i++) {
            if (color.charAt(i) == color.charAt(i + 1)) {
                count++;
            }
        }
        System.out.print(count);
    }
}
