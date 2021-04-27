package isunique;

import static java.util.Arrays.sort;

public class Unique {

    public boolean isUnique(int[] numbers){
        sort(numbers);
        for(int i=0; i< numbers.length-1; i++){
            if(numbers[i] == numbers[i+1]){
                return false;
            }
        }
        return true;

    }
}
