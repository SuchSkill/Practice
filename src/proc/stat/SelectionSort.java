package proc.stat;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Eugene on 22.07.2016.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 6, 3,12, 1, 6, 8,9};
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int MinIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    MinIndex = j;
                }
            }
            swap(arr, i, MinIndex);

        }
        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;


    }
}
