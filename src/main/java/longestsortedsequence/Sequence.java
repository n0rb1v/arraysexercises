package longestsortedsequence;

import java.util.ArrayList;
import java.util.List;

public class Sequence {

    public int longestSortedSequence(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int counter = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                counter++;
            }
            else{
                if (counter > max) {
                    max = counter;
                }
                counter =0;

            }

        }
        return max + 1;
    }


}

