import java.util.Arrays;
import java.util.stream.IntStream;

public class MedianOfTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2)).toArray();
        Arrays.sort(array);

        if (array.length % 2 != 0) {
            return array[array.length / 2];
        } else {
            return (double) (array[array.length / 2] + array[(array.length / 2) - 1]) / 2;
        }
    }
}