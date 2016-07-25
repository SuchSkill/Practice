package proc.stat;

import java.util.Arrays;

/**
 * Created by Eugene on 22.07.2016.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,5,7,3};
        for (int k = arr.length; k > 0; k--) {
            System.out.println(k + "k");
            for (int i = 1; i < k; i++) {
                System.out.println(arr[i]);
                if (arr[i-1] > arr[i]) {
                    swap(arr, i, i - 1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }


}
