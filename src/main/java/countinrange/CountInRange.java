package countinrange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountInRange {

    public int countInRange(int[] numbers, int min, int max) {
//        List<Integer> integers = new ArrayList<>();
//        for (Integer item : numbers) {
//            if (item > min && item < max) {
//                integers.add(item);
//            }
//        }
//        return integers.size();

        return (int)Arrays.stream(numbers)
                .filter(n -> (n > min) && (n < max))
                .count();
    }
}
