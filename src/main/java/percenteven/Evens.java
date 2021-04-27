package percenteven;

import java.util.ArrayList;
import java.util.List;

public class Evens {

    public double percentEven(int[]arr){
        if(arr.length ==0){
            return 0.0;
        }
        List<Integer> evens= new ArrayList<>();
        double percent = 0.0;
        for(Integer item : arr){
            if(item % 2 ==0){
                evens.add(item);
            }
            if(evens.size() == 0){
                return 0.0;
            }
        }
        percent = (double)evens.size() * 100 / arr.length;
        return percent;
    }
}
