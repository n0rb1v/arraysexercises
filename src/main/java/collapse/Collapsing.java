package collapse;

public class Collapsing {

    public int[] collapse(int[] arr){
        int length = arr.length;
        int[] result;
        if (length % 2 == 0) {
            result = new int[length / 2];
        } else {
            result = new int[length / 2 + 1];
            result[length / 2] = arr[arr.length - 1];
        }

        for (int i = 0; i < length / 2; i++) {
            result[i] = arr[2 * i] + arr[2 * i + 1];
        }

        return result;
    }
}
