package proc.stat;

import java.util.Arrays;

/**
 * Created by Eugene on 22.07.2016.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {5,2,3,4,1};
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            for (int j = i-1; j >= 0; j--) {
                if (tmp < arr[j]) {

                    swap(arr, i, j);
                } else {
                    arr[j] = tmp;
                    break;
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
