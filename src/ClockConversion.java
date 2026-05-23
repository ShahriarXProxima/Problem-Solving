import java.util.Scanner;

public class ClockConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String time = input.next();
            int hour = Integer.parseInt(time.substring(0, 2));
            String minutes = time.substring(2);

            String period = (hour >= 12) ? "PM" : "AM";

            int convertedHour = hour;
            if (hour == 0) {
                convertedHour = 12;
            } else if (hour > 12) {
                convertedHour = hour - 12;
            }
            System.out.printf("%02d%s %s%n", convertedHour, minutes, period);
        }
    }

}
