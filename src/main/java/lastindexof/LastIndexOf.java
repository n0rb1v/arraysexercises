package lastindexof;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LastIndexOf {

    public int lastIndexOf(int[] numbers, int value) {
//        List<Integer> transformed = new ArrayList<>();
//        for (Integer item : numbers){
//            transformed.add(item);
//            }
//         return transformed.lastIndexOf(value);

        List<Integer> nmb = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toList());
        return nmb.lastIndexOf(value);
    }
}

