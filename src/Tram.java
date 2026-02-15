import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int station = input.nextInt();
        int a, b;
        int count = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (station-- > 0) {
            a = input.nextInt();
            b = input.nextInt();

            count = count + b;
            count = count - a;

            arrayList.add(count);
        }

        Collections.sort(arrayList);
        System.out.print(arrayList.getLast());

    }
}
