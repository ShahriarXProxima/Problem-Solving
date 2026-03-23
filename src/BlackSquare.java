import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] calories = new int[4];
        for (int i = 0; i < 4; i++) {
            calories[i] = input.nextInt();
        }

        String sequence = input.next();
        int burn = 0;
        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.charAt(i) == '1') {
                burn += calories[0];
            } else if (sequence.charAt(i) == '2') {
                burn += calories[1];
            } else if (sequence.charAt(i) == '3') {
                burn += calories[2];
            } else {
                burn += calories[3];
            }
        }

        System.out.print(burn);
    }
}
