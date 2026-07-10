import java.util.LinkedList;

public class AddTwoNumbers {
    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        StringBuilder list1 = new StringBuilder();
        StringBuilder list2 = new StringBuilder();

        for (int i = l1.size() - 1; i >= 0; i--) {
            list1.append(l1.get(i).toString());
        }
        for (int i = l2.size() - 1; i >= 0; i--) {
            list2.append(l2.get(i).toString());
        }

        int sum = Integer.parseInt(String.valueOf(list1)) + Integer.parseInt(String.valueOf(list2));
        String result = Integer.toString(sum);

        LinkedList<Integer> resultList = new LinkedList<>();
        for (int i = result.length() - 1; i >= 0; i--) {
            resultList.add(Integer.parseInt(String.valueOf(result.charAt(i))));
        }

        return resultList;
    }
}
