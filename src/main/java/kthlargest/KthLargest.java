package kthlargest;

import static java.util.Arrays.sort;

public class KthLargest {

    public int kthLargest(int[] numbers, int k){
        sort(numbers);
        return numbers[numbers.length-1-k];

        }


}
