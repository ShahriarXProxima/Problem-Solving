import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int t = input.nextInt();
        String str = input.next();

        char[] queue = str.toCharArray();

        for (int time = 0; time < t; time++) {
            int i = 0;
            while (i < n - 1) {
                if (queue[i] == 'B' && queue[i + 1] == 'G') {
                    char temp = queue[i];
                    queue[i] = queue[i + 1];
                    queue[i + 1] = temp;

                    i += 2;
                } else {
                    i++;
                }
            }
        }
        System.out.print(new String(queue));
    }
}
