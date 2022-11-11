package Classes;

import java.util.Comparator;

public class SortingAlgorithms {

    public static void quickSort(Object[] array, Comparator comparator) {
        if (array.length > 0)
            quickSort(array, 0, array.length - 1, comparator);
    }

    private static void quickSort(Object[] array, int begin, int end, Comparator comparator) {
        int left = begin, right = end;
        Object mid = array[(left + right)/2];
        while (left < right) {
            while (comparator.compare(array[left], mid) < 0) left++;

            while (comparator.compare(array[right], mid) > 0) right--;

            Object temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }

        if (begin < right)
            quickSort(array, begin, right, comparator);
        if (end > left)
            quickSort(array, left, end, comparator);
    }
}
