package mingap;

public class Gap {

    public int minGap(int[] arr){
        if(arr.length == 0 || arr.length == 1){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for(int i =0; i< arr.length-1; i++){
            if(arr[i+1] - arr[i] < min){
                min = arr[i+1] - arr[i];
            }
        }
        return min;
    }
}
