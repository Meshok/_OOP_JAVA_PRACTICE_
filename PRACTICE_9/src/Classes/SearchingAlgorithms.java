package Classes;

import java.util.Comparator;

public class SearchingAlgorithms {
    public static int linearSearch(Object search, Object[] arr, Comparator comparator) throws SearchException {
        for (int i = 0; i < arr.length; i++) {
            if (comparator.compare(search, arr[i]) == 0) {
                return i;
            }
        }
        throw new SearchException();
    }
}
