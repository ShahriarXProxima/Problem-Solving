import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            int day = 0;
            long total = a + b + c;
            long fullCycles = (n - 1) / total;
            long remaining = n - fullCycles * total;

            if (remaining <= a)
                day = Math.toIntExact(fullCycles * 3 + 1);
            else if (remaining <= a + b)
                day = Math.toIntExact(fullCycles * 3 + 2);
            else
                day = Math.toIntExact(fullCycles * 3 + 3);

            System.out.println(day);
        }
    }
}
