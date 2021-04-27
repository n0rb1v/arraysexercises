package evenbeforeodd;

import java.util.Arrays;

public class EvensFirst {

    public int[] evenBeforeOdd(int[] numbers){
        int[] result = new int[numbers.length];
        int index = 0;
        int index2 = 0;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] % 2 == 0){
                result[index] = numbers[i];
                index++;
            }
            else {
                result[numbers.length-1-index2] = numbers[i];
                index2++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        EvensFirst e = new EvensFirst();
        int[] arr = new int[]{5, 4, 2, 11, 9, 10, 4, 7, 3};

        int[] result = e.evenBeforeOdd(new int[]{5, 4, 2, 11, 9, 10, 4, 7, 3});
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
    }
}
