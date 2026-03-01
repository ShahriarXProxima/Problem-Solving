import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AntonAndPolyhedrons {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int polyhedron = input.nextInt();
       int faces = 0;
       Map<String, Integer> antonsCollection = new HashMap<>();

       antonsCollection.put("Tetrahedron", 4);
       antonsCollection.put("cube", 6);
       antonsCollection.put("Octahedron", 8);
       antonsCollection.put("Dodecahedron", 12);
       antonsCollection.put("Icosahedron", 20);

       for(int i = 1; i<=polyhedron; i++ ){

       }

    }

}
