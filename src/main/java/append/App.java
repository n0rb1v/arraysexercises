package append;

public class App {

    public int[] append(int[] a1, int[]a2){
        int[] result = new int[a1.length + a2.length];
        int index= 0;

        for(int i = 0; i< a1.length; i++){
            result[index] =a1[i];
            index++;
        }
        for(int i = 0; i< a2.length; i++){
            result[index] =a2[i];
            index++;
        }
        return result;

    }
}
