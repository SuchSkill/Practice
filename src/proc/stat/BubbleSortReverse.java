package proc.stat;

import java.util.Arrays;

/**
 * Created by Eugene on 22.07.2016.
 */
public class BubbleSortReverse {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 3,5};
        for (int k = arr.length; k > 0; k--) {
            System.out.println(k + "k");
            for (int i = 1; i < k; i++) {
                System.out.println(arr[i]);
                if (arr[i] > arr[i - 1]) {
                    swap(arr, i);
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int[] arr, int i) {
        int tmp = arr[i];
        arr[i] = arr[i - 1];
        arr[i - 1] = tmp;
    }


}
