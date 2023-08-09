package java_exercises;

import java.util.ArrayList;
import java.util.List;

public class KataRemovingElements {
    public static Object[] removeEveryOther(Object[] arr) {
        List<Object> newList = new ArrayList<>();
        for (int i = 1; i <= arr.length; i++) {
            if (i % 2 != 0) {
                newList.add(arr[i - 1]);
            }
        }
        return newList.toArray();
    }
}
