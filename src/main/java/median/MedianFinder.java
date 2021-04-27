package median;

import static java.util.Arrays.sort;

public class MedianFinder {

    public double median(int[] numbers) {
        sort(numbers);
        double m = 0;
        if (numbers.length % 2 == 1) {
            m = numbers[(numbers.length + 1) / 2 - 1];
        } else {
            m = (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2.0;
        }

        return m;
    }

}
