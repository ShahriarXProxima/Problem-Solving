import java.util.Scanner;

public class Maximize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test= input.nextInt();
        while(test-->0){
            int x= input.nextInt();
            System.out.println(--x);
        }
    }
}
